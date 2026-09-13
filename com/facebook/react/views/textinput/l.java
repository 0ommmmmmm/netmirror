package com.facebook.react.views.textinput;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.events.EventDispatcher;

/* JADX INFO: loaded from: classes.dex */
class l extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C0441j f8144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private EventDispatcher f8145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f8146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f8147d;

    public l(InputConnection inputConnection, ReactContext reactContext, C0441j c0441j, EventDispatcher eventDispatcher) {
        super(inputConnection, false);
        this.f8147d = null;
        this.f8145b = eventDispatcher;
        this.f8144a = c0441j;
    }

    private void a(String str) {
        if (str.equals("\n")) {
            str = "Enter";
        }
        this.f8145b.b(new q(this.f8144a.getId(), str));
    }

    private void b(String str) {
        if (this.f8146c) {
            this.f8147d = str;
        } else {
            a(str);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        this.f8146c = true;
        return super.beginBatchEdit();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence charSequence, int i3) {
        String string = charSequence.toString();
        if (string.length() <= 2) {
            if (string.equals("")) {
                string = "Backspace";
            }
            b(string);
        }
        return super.commitText(charSequence, i3);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i3, int i4) {
        a("Backspace");
        return super.deleteSurroundingText(i3, i4);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        this.f8146c = false;
        String str = this.f8147d;
        if (str != null) {
            a(str);
            this.f8147d = null;
        }
        return super.endBatchEdit();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            boolean z3 = keyEvent.getUnicodeChar() < 58 && keyEvent.getUnicodeChar() > 47;
            if (keyEvent.getKeyCode() == 67) {
                a("Backspace");
            } else if (keyEvent.getKeyCode() == 66) {
                a("Enter");
            } else if (z3) {
                a(String.valueOf(keyEvent.getNumber()));
            }
        }
        return super.sendKeyEvent(keyEvent);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence charSequence, int i3) {
        int selectionStart = this.f8144a.getSelectionStart();
        int selectionEnd = this.f8144a.getSelectionEnd();
        boolean composingText = super.setComposingText(charSequence, i3);
        int selectionStart2 = this.f8144a.getSelectionStart();
        b((selectionStart2 < selectionStart || selectionStart2 <= 0 || (!(selectionStart == selectionEnd) && (selectionStart2 == selectionStart))) ? "Backspace" : String.valueOf(this.f8144a.getText().charAt(selectionStart2 - 1)));
        return composingText;
    }
}
