package com.facebook.react.views.textinput;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.common.mapbuffer.ReadableMapBuffer;
import com.facebook.react.uimanager.A0;
import com.facebook.react.uimanager.AbstractC0428y;
import com.facebook.react.uimanager.B0;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.C0381a;
import com.facebook.react.uimanager.C0392f0;
import com.facebook.react.uimanager.C0417s0;
import com.facebook.react.uimanager.H0;
import com.facebook.react.uimanager.U;
import com.facebook.react.uimanager.W;
import com.facebook.react.uimanager.X;
import com.facebook.react.uimanager.events.EventDispatcher;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
@p086v1.a(name = ReactTextInputManager.REACT_CLASS)
public class ReactTextInputManager extends BaseViewManager<C0441j, U> {
    private static final int AUTOCAPITALIZE_FLAGS = 28672;
    private static final int BLUR_TEXT_INPUT = 2;
    private static final int FOCUS_TEXT_INPUT = 1;
    private static final int IME_ACTION_ID = 1648;
    private static final int INPUT_TYPE_KEYBOARD_DECIMAL_PAD = 8194;
    private static final int INPUT_TYPE_KEYBOARD_NUMBERED = 12290;
    private static final int INPUT_TYPE_KEYBOARD_NUMBER_PAD = 2;
    private static final String KEYBOARD_TYPE_DECIMAL_PAD = "decimal-pad";
    private static final String KEYBOARD_TYPE_EMAIL_ADDRESS = "email-address";
    private static final String KEYBOARD_TYPE_NUMBER_PAD = "number-pad";
    private static final String KEYBOARD_TYPE_NUMERIC = "numeric";
    private static final String KEYBOARD_TYPE_PHONE_PAD = "phone-pad";
    private static final String KEYBOARD_TYPE_URI = "url";
    private static final String KEYBOARD_TYPE_VISIBLE_PASSWORD = "visible-password";
    private static final int PASSWORD_VISIBILITY_FLAG = 16;
    public static final String REACT_CLASS = "AndroidTextInput";
    private static final int SET_TEXT_AND_SELECTION = 4;
    public static final String TAG = "ReactTextInputManager";
    private static final short TX_STATE_KEY_ATTRIBUTED_STRING = 0;
    private static final short TX_STATE_KEY_HASH = 2;
    private static final short TX_STATE_KEY_MOST_RECENT_EVENT_COUNT = 3;
    private static final short TX_STATE_KEY_PARAGRAPH_ATTRIBUTES = 1;
    private static final int UNSET = -1;
    protected com.facebook.react.views.text.o mReactTextViewManagerCallback;
    private static final int SET_MOST_RECENT_EVENT_COUNT = 3;
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, SET_MOST_RECENT_EVENT_COUNT};
    private static final Map<String, String> REACT_PROPS_AUTOFILL_HINTS_MAP = new a();
    private static final InputFilter[] EMPTY_FILTERS = new InputFilter[0];
    private static final String[] DRAWABLE_HANDLE_RESOURCES = {"mTextSelectHandleLeftRes", "mTextSelectHandleRightRes", "mTextSelectHandleRes"};
    private static final String[] DRAWABLE_HANDLE_FIELDS = {"mSelectHandleLeft", "mSelectHandleRight", "mSelectHandleCenter"};

    class a extends HashMap {
        a() {
            put("birthdate-day", "birthDateDay");
            put("birthdate-full", "birthDateFull");
            put("birthdate-month", "birthDateMonth");
            put("birthdate-year", "birthDateYear");
            put("cc-csc", "creditCardSecurityCode");
            put("cc-exp", "creditCardExpirationDate");
            put("cc-exp-day", "creditCardExpirationDay");
            put("cc-exp-month", "creditCardExpirationMonth");
            put("cc-exp-year", "creditCardExpirationYear");
            put("cc-number", "creditCardNumber");
            put("email", "emailAddress");
            put("gender", "gender");
            put("name", "personName");
            put("name-family", "personFamilyName");
            put("name-given", "personGivenName");
            put("name-middle", "personMiddleName");
            put("name-middle-initial", "personMiddleInitial");
            put("name-prefix", "personNamePrefix");
            put("name-suffix", "personNameSuffix");
            put("password", "password");
            put("password-new", "newPassword");
            put("postal-address", "postalAddress");
            put("postal-address-country", "addressCountry");
            put("postal-address-extended", "extendedAddress");
            put("postal-address-extended-postal-code", "extendedPostalCode");
            put("postal-address-locality", "addressLocality");
            put("postal-address-region", "addressRegion");
            put("postal-code", "postalCode");
            put("street-address", "streetAddress");
            put("sms-otp", "smsOTPCode");
            put("tel", "phoneNumber");
            put("tel-country-code", "phoneCountryCode");
            put("tel-national", "phoneNational");
            put("tel-device", "phoneNumberDevice");
            put("username", "username");
            put("username-new", "newUsername");
        }
    }

    private static class b implements InterfaceC0432a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C0441j f8075a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final EventDispatcher f8076b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f8077c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f8078d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f8079e = 0;

        public b(C0441j c0441j) {
            this.f8075a = c0441j;
            ReactContext reactContextD = H0.d(c0441j);
            this.f8076b = ReactTextInputManager.getEventDispatcher(reactContextD, c0441j);
            this.f8077c = H0.e(reactContextD);
        }

        @Override // com.facebook.react.views.textinput.InterfaceC0432a
        public void a() {
            if (this.f8076b == null) {
                return;
            }
            int width = this.f8075a.getWidth();
            int height = this.f8075a.getHeight();
            if (this.f8075a.getLayout() != null) {
                width = this.f8075a.getCompoundPaddingLeft() + this.f8075a.getLayout().getWidth() + this.f8075a.getCompoundPaddingRight();
                height = this.f8075a.getCompoundPaddingTop() + this.f8075a.getLayout().getHeight() + this.f8075a.getCompoundPaddingBottom();
            }
            if (width == this.f8078d && height == this.f8079e) {
                return;
            }
            this.f8079e = height;
            this.f8078d = width;
            this.f8076b.b(new C0433b(this.f8077c, this.f8075a.getId(), C0392f0.f(width), C0392f0.f(height)));
        }
    }

    private static class c implements J {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C0441j f8080a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final EventDispatcher f8081b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f8082c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f8083d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f8084e;

        public c(C0441j c0441j) {
            this.f8080a = c0441j;
            ReactContext reactContextD = H0.d(c0441j);
            this.f8081b = ReactTextInputManager.getEventDispatcher(reactContextD, c0441j);
            this.f8082c = H0.e(reactContextD);
        }

        @Override // com.facebook.react.views.textinput.J
        public void a(int i3, int i4, int i5, int i6) {
            if (this.f8083d == i3 && this.f8084e == i4) {
                return;
            }
            this.f8081b.b(com.facebook.react.views.scroll.k.x(this.f8082c, this.f8080a.getId(), com.facebook.react.views.scroll.l.SCROLL, i3, i4, 0.0f, 0.0f, 0, 0, this.f8080a.getWidth(), this.f8080a.getHeight()));
            this.f8083d = i3;
            this.f8084e = i4;
        }
    }

    private static class d implements K {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C0441j f8085a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final EventDispatcher f8086b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f8087c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f8088d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f8089e;

        public d(C0441j c0441j) {
            this.f8085a = c0441j;
            ReactContext reactContextD = H0.d(c0441j);
            this.f8086b = ReactTextInputManager.getEventDispatcher(reactContextD, c0441j);
            this.f8087c = H0.e(reactContextD);
        }

        @Override // com.facebook.react.views.textinput.K
        public void a(int i3, int i4) {
            int iMin = Math.min(i3, i4);
            int iMax = Math.max(i3, i4);
            if (this.f8088d == iMin && this.f8089e == iMax) {
                return;
            }
            this.f8086b.b(new G(this.f8087c, this.f8085a.getId(), iMin, iMax));
            this.f8088d = iMin;
            this.f8089e = iMax;
        }
    }

    private final class e implements TextWatcher {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final C0441j f8090b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final EventDispatcher f8091c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f8092d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f8093e = null;

        public e(ReactContext reactContext, C0441j c0441j) {
            this.f8091c = ReactTextInputManager.getEventDispatcher(reactContext, c0441j);
            this.f8090b = c0441j;
            this.f8092d = H0.e(reactContext);
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
            this.f8093e = charSequence.toString();
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
            if (this.f8090b.f8118M) {
                return;
            }
            if (i5 == 0 && i4 == 0) {
                return;
            }
            p002a1.a.c(this.f8093e);
            String strSubstring = charSequence.toString().substring(i3, i3 + i5);
            String strSubstring2 = this.f8093e.substring(i3, i3 + i4);
            if (i5 == i4 && strSubstring.equals(strSubstring2)) {
                return;
            }
            A0 stateWrapper = this.f8090b.getStateWrapper();
            if (stateWrapper != null) {
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putInt("mostRecentEventCount", this.f8090b.A());
                writableNativeMap.putInt("opaqueCacheId", this.f8090b.getId());
                stateWrapper.b(writableNativeMap);
            }
            this.f8091c.b(new m(this.f8092d, this.f8090b.getId(), charSequence.toString(), this.f8090b.A()));
        }
    }

    private static void checkPasswordType(C0441j c0441j) {
        if ((c0441j.getStagedInputType() & INPUT_TYPE_KEYBOARD_NUMBERED) == 0 || (c0441j.getStagedInputType() & 128) == 0) {
            return;
        }
        updateStagedInputTypeFlag(c0441j, 128, PASSWORD_VISIBILITY_FLAG);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static EventDispatcher getEventDispatcher(ReactContext reactContext, C0441j c0441j) {
        return H0.c(reactContext, c0441j.getId());
    }

    private com.facebook.react.views.text.i getReactTextUpdate(String str, int i3) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) com.facebook.react.views.text.u.b(str, com.facebook.react.views.text.u.UNSET));
        return new com.facebook.react.views.text.i(spannableStringBuilder, i3, false, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$addEventEmitters$0(B0 b4, C0441j c0441j, View view, boolean z3) {
        int iC = b4.c();
        EventDispatcher eventDispatcher = getEventDispatcher(b4, c0441j);
        if (z3) {
            eventDispatcher.b(new p(iC, c0441j.getId()));
        } else {
            eventDispatcher.b(new n(iC, c0441j.getId()));
            eventDispatcher.b(new o(iC, c0441j.getId(), c0441j.getText().toString()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$addEventEmitters$1(C0441j c0441j, B0 b4, TextView textView, int i3, KeyEvent keyEvent) {
        if ((i3 & 255) == 0 && i3 != 0) {
            return true;
        }
        boolean zB = c0441j.B();
        boolean Z3 = c0441j.Z();
        boolean zY = c0441j.Y();
        if (Z3) {
            getEventDispatcher(b4, c0441j).b(new I(b4.c(), c0441j.getId(), c0441j.getText().toString()));
        }
        if (zY) {
            c0441j.clearFocus();
        }
        return zY || Z3 || !zB || i3 == 5 || i3 == 7;
    }

    private void setAutofillHints(C0441j c0441j, String... strArr) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        c0441j.setAutofillHints(strArr);
    }

    private static boolean shouldHideCursorForEmailTextInput() {
        return Build.VERSION.SDK_INT == 29 && Build.MANUFACTURER.toLowerCase(Locale.ROOT).contains("xiaomi");
    }

    private static void updateStagedInputTypeFlag(C0441j c0441j, int i3, int i4) {
        c0441j.setStagedInputType(((~i3) & c0441j.getStagedInputType()) | i4);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return p018e1.d.e("focusTextInput", 1, "blurTextInput", 2);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        Map<String, Object> exportedCustomBubblingEventTypeConstants = super.getExportedCustomBubblingEventTypeConstants();
        if (exportedCustomBubblingEventTypeConstants == null) {
            exportedCustomBubblingEventTypeConstants = new HashMap<>();
        }
        exportedCustomBubblingEventTypeConstants.putAll(p018e1.d.a().b("topSubmitEditing", p018e1.d.d("phasedRegistrationNames", p018e1.d.e("bubbled", "onSubmitEditing", "captured", "onSubmitEditingCapture"))).b("topEndEditing", p018e1.d.d("phasedRegistrationNames", p018e1.d.e("bubbled", "onEndEditing", "captured", "onEndEditingCapture"))).b("topFocus", p018e1.d.d("phasedRegistrationNames", p018e1.d.e("bubbled", "onFocus", "captured", "onFocusCapture"))).b("topBlur", p018e1.d.d("phasedRegistrationNames", p018e1.d.e("bubbled", "onBlur", "captured", "onBlurCapture"))).b("topKeyPress", p018e1.d.d("phasedRegistrationNames", p018e1.d.e("bubbled", "onKeyPress", "captured", "onKeyPressCapture"))).a());
        return exportedCustomBubblingEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        exportedCustomDirectEventTypeConstants.putAll(p018e1.d.a().b(com.facebook.react.views.scroll.l.b(com.facebook.react.views.scroll.l.SCROLL), p018e1.d.d("registrationName", "onScroll")).a());
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedViewConstants() {
        return p018e1.d.d("AutoCapitalizationType", p018e1.d.g("none", 0, "characters", 4096, "words", 8192, "sentences", 16384));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<? extends U> getShadowNodeClass() {
        return H.class;
    }

    @L1.a(defaultBoolean = true, name = "allowFontScaling")
    public void setAllowFontScaling(C0441j c0441j, boolean z3) {
        c0441j.setAllowFontScaling(z3);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x005a  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @L1.a(name = "autoCapitalize")
    public void setAutoCapitalize(C0441j c0441j, Dynamic dynamic) {
        int iAsInt = 0;
        if (dynamic.getType() == ReadableType.Number) {
            iAsInt = dynamic.asInt();
        } else if (dynamic.getType() == ReadableType.String) {
            String strAsString = dynamic.asString();
            strAsString.hashCode();
            byte b4 = -1;
            switch (strAsString.hashCode()) {
                case 3387192:
                    if (strAsString.equals("none")) {
                        b4 = 0;
                    }
                    break;
                case 113318569:
                    if (strAsString.equals("words")) {
                        b4 = 1;
                    }
                    break;
                case 490141296:
                    if (strAsString.equals("sentences")) {
                        b4 = 2;
                    }
                    break;
                case 1245424234:
                    if (strAsString.equals("characters")) {
                        b4 = 3;
                    }
                    break;
            }
            switch (b4) {
                case WebSettingsBoundaryInterface.ForceDarkBehavior.FORCE_DARK_ONLY /* 0 */:
                    break;
                case 1:
                    iAsInt = 8192;
                    break;
                case 2:
                default:
                    iAsInt = 16384;
                    break;
                case SET_MOST_RECENT_EVENT_COUNT /* 3 */:
                    iAsInt = 4096;
                    break;
            }
        } else {
            iAsInt = 16384;
        }
        updateStagedInputTypeFlag(c0441j, AUTOCAPITALIZE_FLAGS, iAsInt);
    }

    @L1.a(name = "autoCorrect")
    public void setAutoCorrect(C0441j c0441j, Boolean bool) {
        int i3;
        if (bool != null) {
            i3 = bool.booleanValue() ? 32768 : 524288;
        } else {
            i3 = 0;
        }
        updateStagedInputTypeFlag(c0441j, 557056, i3);
    }

    @L1.a(defaultBoolean = false, name = "autoFocus")
    public void setAutoFocus(C0441j c0441j, boolean z3) {
        c0441j.setAutoFocus(z3);
    }

    @L1.b(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor"})
    public void setBorderColor(C0441j c0441j, int i3, Integer num) {
        C0381a.p(c0441j, R1.n.ALL, num);
    }

    @L1.b(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public void setBorderRadius(C0441j c0441j, int i3, float f3) {
        C0381a.q(c0441j, R1.d.values()[i3], Float.isNaN(f3) ? null : new W(f3, X.POINT));
    }

    @L1.a(name = "borderStyle")
    public void setBorderStyle(C0441j c0441j, String str) {
        C0381a.r(c0441j, str == null ? null : R1.f.b(str));
    }

    @L1.b(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth"})
    public void setBorderWidth(C0441j c0441j, int i3, float f3) {
        C0381a.s(c0441j, R1.n.values()[i3], Float.valueOf(f3));
    }

    @L1.a(defaultBoolean = false, name = "caretHidden")
    public void setCaretHidden(C0441j c0441j, boolean z3) {
        if (c0441j.getStagedInputType() == 32 && shouldHideCursorForEmailTextInput()) {
            return;
        }
        c0441j.setCursorVisible(!z3);
    }

    @L1.a(customType = "Color", name = "color")
    public void setColor(C0441j c0441j, Integer num) {
        if (num != null) {
            c0441j.setTextColor(num.intValue());
            return;
        }
        ColorStateList colorStateListB = com.facebook.react.views.text.a.b(c0441j.getContext());
        if (colorStateListB != null) {
            c0441j.setTextColor(colorStateListB);
            return;
        }
        Context context = c0441j.getContext();
        String str = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("Could not get default text color from View Context: ");
        sb.append(context != null ? context.getClass().getCanonicalName() : "null");
        ReactSoftExceptionLogger.logSoftException(str, new IllegalStateException(sb.toString()));
    }

    @L1.a(defaultBoolean = false, name = "contextMenuHidden")
    public void setContextMenuHidden(C0441j c0441j, boolean z3) {
        c0441j.setContextMenuHidden(z3);
    }

    @L1.a(customType = "Color", name = "cursorColor")
    public void setCursorColor(C0441j c0441j, Integer num) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
            Drawable textCursorDrawable = c0441j.getTextCursorDrawable();
            if (textCursorDrawable != null) {
                if (num != null) {
                    com.facebook.react.uimanager.B.a();
                    textCursorDrawable.setColorFilter(AbstractC0428y.a(num.intValue(), BlendMode.SRC_IN));
                } else {
                    textCursorDrawable.clearColorFilter();
                }
                c0441j.setTextCursorDrawable(textCursorDrawable);
                return;
            }
            return;
        }
        if (i3 == 28) {
            return;
        }
        try {
            Field declaredField = c0441j.getClass().getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            int i4 = declaredField.getInt(c0441j);
            if (i4 == 0) {
                return;
            }
            Drawable drawableMutate = androidx.core.content.a.d(c0441j.getContext(), i4).mutate();
            if (num != null) {
                drawableMutate.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
            } else {
                drawableMutate.clearColorFilter();
            }
            Field declaredField2 = TextView.class.getDeclaredField("mEditor");
            declaredField2.setAccessible(true);
            Object obj = declaredField2.get(c0441j);
            Field declaredField3 = obj.getClass().getDeclaredField("mCursorDrawable");
            declaredField3.setAccessible(true);
            declaredField3.set(obj, new Drawable[]{drawableMutate, drawableMutate});
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
    }

    @L1.a(defaultBoolean = false, name = "disableFullscreenUI")
    public void setDisableFullscreenUI(C0441j c0441j, boolean z3) {
        c0441j.setDisableFullscreenUI(z3);
    }

    @L1.a(defaultBoolean = true, name = "editable")
    public void setEditable(C0441j c0441j, boolean z3) {
        c0441j.setEnabled(z3);
    }

    @L1.a(name = "fontFamily")
    public void setFontFamily(C0441j c0441j, String str) {
        c0441j.setFontFamily(str);
    }

    @L1.a(defaultFloat = 14.0f, name = "fontSize")
    public void setFontSize(C0441j c0441j, float f3) {
        c0441j.setFontSize(f3);
    }

    @L1.a(name = "fontStyle")
    public void setFontStyle(C0441j c0441j, String str) {
        c0441j.setFontStyle(str);
    }

    @L1.a(name = "fontVariant")
    public void setFontVariant(C0441j c0441j, ReadableArray readableArray) {
        c0441j.setFontFeatureSettings(com.facebook.react.views.text.p.c(readableArray));
    }

    @L1.a(name = "fontWeight")
    public void setFontWeight(C0441j c0441j, String str) {
        c0441j.setFontWeight(str);
    }

    @L1.a(name = "importantForAutofill")
    public void setImportantForAutofill(C0441j c0441j, String str) {
        int i3;
        if ("no".equals(str)) {
            i3 = 2;
        } else if ("noExcludeDescendants".equals(str)) {
            i3 = 8;
        } else if ("yes".equals(str)) {
            i3 = 1;
        } else {
            i3 = "yesExcludeDescendants".equals(str) ? SET_TEXT_AND_SELECTION : 0;
        }
        setImportantForAutofill(c0441j, i3);
    }

    @L1.a(defaultBoolean = true, name = "includeFontPadding")
    public void setIncludeFontPadding(C0441j c0441j, boolean z3) {
        c0441j.setIncludeFontPadding(z3);
    }

    @L1.a(name = "inlineImageLeft")
    public void setInlineImageLeft(C0441j c0441j, String str) {
        c0441j.setCompoundDrawablesWithIntrinsicBounds(X1.c.d().f(c0441j.getContext(), str), 0, 0, 0);
    }

    @L1.a(name = "inlineImagePadding")
    public void setInlineImagePadding(C0441j c0441j, int i3) {
        c0441j.setCompoundDrawablePadding(i3);
    }

    @L1.a(name = "keyboardType")
    public void setKeyboardType(C0441j c0441j, String str) {
        int i3;
        if (KEYBOARD_TYPE_NUMERIC.equalsIgnoreCase(str)) {
            i3 = INPUT_TYPE_KEYBOARD_NUMBERED;
        } else if (KEYBOARD_TYPE_NUMBER_PAD.equalsIgnoreCase(str)) {
            i3 = 2;
        } else if (KEYBOARD_TYPE_DECIMAL_PAD.equalsIgnoreCase(str)) {
            i3 = INPUT_TYPE_KEYBOARD_DECIMAL_PAD;
        } else if (KEYBOARD_TYPE_EMAIL_ADDRESS.equalsIgnoreCase(str)) {
            if (shouldHideCursorForEmailTextInput()) {
                c0441j.setCursorVisible(false);
            }
            i3 = 33;
        } else if (KEYBOARD_TYPE_PHONE_PAD.equalsIgnoreCase(str)) {
            i3 = SET_MOST_RECENT_EVENT_COUNT;
        } else if (KEYBOARD_TYPE_VISIBLE_PASSWORD.equalsIgnoreCase(str)) {
            i3 = 144;
        } else {
            i3 = KEYBOARD_TYPE_URI.equalsIgnoreCase(str) ? PASSWORD_VISIBILITY_FLAG : 1;
        }
        updateStagedInputTypeFlag(c0441j, 15, i3);
        checkPasswordType(c0441j);
    }

    @L1.a(defaultFloat = 0.0f, name = "letterSpacing")
    public void setLetterSpacing(C0441j c0441j, float f3) {
        c0441j.setLetterSpacingPt(f3);
    }

    @L1.a(defaultFloat = 0.0f, name = "lineHeight")
    public void setLineHeight(C0441j c0441j, int i3) {
        c0441j.setLineHeight(i3);
    }

    @L1.a(defaultFloat = Float.NaN, name = "maxFontSizeMultiplier")
    public void setMaxFontSizeMultiplier(C0441j c0441j, float f3) {
        c0441j.setMaxFontSizeMultiplier(f3);
    }

    @L1.a(name = "maxLength")
    public void setMaxLength(C0441j c0441j, Integer num) {
        InputFilter[] filters = c0441j.getFilters();
        InputFilter[] inputFilterArr = EMPTY_FILTERS;
        if (num == null) {
            if (filters.length > 0) {
                LinkedList linkedList = new LinkedList();
                for (InputFilter inputFilter : filters) {
                    if (!(inputFilter instanceof InputFilter.LengthFilter)) {
                        linkedList.add(inputFilter);
                    }
                }
                if (!linkedList.isEmpty()) {
                    inputFilterArr = (InputFilter[]) linkedList.toArray(new InputFilter[linkedList.size()]);
                }
            }
        } else if (filters.length > 0) {
            boolean z3 = false;
            for (int i3 = 0; i3 < filters.length; i3++) {
                if (filters[i3] instanceof InputFilter.LengthFilter) {
                    filters[i3] = new InputFilter.LengthFilter(num.intValue());
                    z3 = true;
                }
            }
            if (!z3) {
                InputFilter[] inputFilterArr2 = new InputFilter[filters.length + 1];
                System.arraycopy(filters, 0, inputFilterArr2, 0, filters.length);
                filters[filters.length] = new InputFilter.LengthFilter(num.intValue());
                filters = inputFilterArr2;
            }
            inputFilterArr = filters;
        } else {
            inputFilterArr = new InputFilter[]{new InputFilter.LengthFilter(num.intValue())};
        }
        c0441j.setFilters(inputFilterArr);
    }

    @L1.a(defaultBoolean = false, name = "multiline")
    public void setMultiline(C0441j c0441j, boolean z3) {
        updateStagedInputTypeFlag(c0441j, z3 ? 0 : 131072, z3 ? 131072 : 0);
    }

    @L1.a(defaultInt = 1, name = "numberOfLines")
    public void setNumLines(C0441j c0441j, int i3) {
        c0441j.setLines(i3);
    }

    @L1.a(defaultBoolean = false, name = "onContentSizeChange")
    public void setOnContentSizeChange(C0441j c0441j, boolean z3) {
        if (z3) {
            c0441j.setContentSizeWatcher(new b(c0441j));
        } else {
            c0441j.setContentSizeWatcher(null);
        }
    }

    @L1.a(defaultBoolean = false, name = "onKeyPress")
    public void setOnKeyPress(C0441j c0441j, boolean z3) {
        c0441j.setOnKeyPress(z3);
    }

    @L1.a(defaultBoolean = false, name = "onScroll")
    public void setOnScroll(C0441j c0441j, boolean z3) {
        if (z3) {
            c0441j.setScrollWatcher(new c(c0441j));
        } else {
            c0441j.setScrollWatcher(null);
        }
    }

    @L1.a(defaultBoolean = false, name = "onSelectionChange")
    public void setOnSelectionChange(C0441j c0441j, boolean z3) {
        if (z3) {
            c0441j.setSelectionWatcher(new d(c0441j));
        } else {
            c0441j.setSelectionWatcher(null);
        }
    }

    @L1.a(name = "overflow")
    public void setOverflow(C0441j c0441j, String str) {
        c0441j.setOverflow(str);
    }

    @L1.a(name = "placeholder")
    public void setPlaceholder(C0441j c0441j, String str) {
        c0441j.setPlaceholder(str);
    }

    @L1.a(customType = "Color", name = "placeholderTextColor")
    public void setPlaceholderTextColor(C0441j c0441j, Integer num) {
        if (num == null) {
            c0441j.setHintTextColor(com.facebook.react.views.text.a.d(c0441j.getContext()));
        } else {
            c0441j.setHintTextColor(num.intValue());
        }
    }

    @L1.a(name = "returnKeyLabel")
    public void setReturnKeyLabel(C0441j c0441j, String str) {
        c0441j.setImeActionLabel(str, IME_ACTION_ID);
    }

    @L1.a(name = "returnKeyType")
    public void setReturnKeyType(C0441j c0441j, String str) {
        c0441j.setReturnKeyType(str);
    }

    @L1.a(defaultBoolean = false, name = "secureTextEntry")
    public void setSecureTextEntry(C0441j c0441j, boolean z3) {
        updateStagedInputTypeFlag(c0441j, 144, z3 ? 128 : 0);
        checkPasswordType(c0441j);
    }

    @L1.a(defaultBoolean = false, name = "selectTextOnFocus")
    public void setSelectTextOnFocus(C0441j c0441j, boolean z3) {
        c0441j.setSelectTextOnFocus(z3);
    }

    @L1.a(customType = "Color", name = "selectionColor")
    public void setSelectionColor(C0441j c0441j, Integer num) {
        if (num == null) {
            c0441j.setHighlightColor(com.facebook.react.views.text.a.c(c0441j.getContext()));
        } else {
            c0441j.setHighlightColor(num.intValue());
        }
    }

    @L1.a(customType = "Color", name = "selectionHandleColor")
    public void setSelectionHandleColor(C0441j c0441j, Integer num) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
            Drawable drawableMutate = c0441j.getTextSelectHandle().mutate();
            Drawable drawableMutate2 = c0441j.getTextSelectHandleLeft().mutate();
            Drawable drawableMutate3 = c0441j.getTextSelectHandleRight().mutate();
            if (num != null) {
                com.facebook.react.uimanager.B.a();
                BlendModeColorFilter blendModeColorFilterA = AbstractC0428y.a(num.intValue(), BlendMode.SRC_IN);
                drawableMutate.setColorFilter(blendModeColorFilterA);
                drawableMutate2.setColorFilter(blendModeColorFilterA);
                drawableMutate3.setColorFilter(blendModeColorFilterA);
            } else {
                drawableMutate.clearColorFilter();
                drawableMutate2.clearColorFilter();
                drawableMutate3.clearColorFilter();
            }
            c0441j.setTextSelectHandle(drawableMutate);
            c0441j.setTextSelectHandleLeft(drawableMutate2);
            c0441j.setTextSelectHandleRight(drawableMutate3);
            return;
        }
        if (i3 == 28) {
            return;
        }
        int i4 = 0;
        while (true) {
            String[] strArr = DRAWABLE_HANDLE_RESOURCES;
            if (i4 >= strArr.length) {
                return;
            }
            try {
                Field declaredField = c0441j.getClass().getDeclaredField(strArr[i4]);
                declaredField.setAccessible(true);
                int i5 = declaredField.getInt(c0441j);
                if (i5 == 0) {
                    return;
                }
                Drawable drawableMutate4 = androidx.core.content.a.d(c0441j.getContext(), i5).mutate();
                if (num != null) {
                    drawableMutate4.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
                } else {
                    drawableMutate4.clearColorFilter();
                }
                Field declaredField2 = TextView.class.getDeclaredField("mEditor");
                declaredField2.setAccessible(true);
                Object obj = declaredField2.get(c0441j);
                Field declaredField3 = obj.getClass().getDeclaredField(DRAWABLE_HANDLE_FIELDS[i4]);
                declaredField3.setAccessible(true);
                declaredField3.set(obj, drawableMutate4);
                i4++;
            } catch (IllegalAccessException | NoSuchFieldException unused) {
            }
        }
    }

    @L1.a(name = "submitBehavior")
    public void setSubmitBehavior(C0441j c0441j, String str) {
        c0441j.setSubmitBehavior(str);
    }

    @L1.a(name = "textAlign")
    public void setTextAlign(C0441j c0441j, String str) {
        if ("justify".equals(str)) {
            if (Build.VERSION.SDK_INT >= 26) {
                c0441j.setJustificationMode(1);
            }
            c0441j.setGravityHorizontal(SET_MOST_RECENT_EVENT_COUNT);
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            c0441j.setJustificationMode(0);
        }
        if (str == null || "auto".equals(str)) {
            c0441j.setGravityHorizontal(0);
            return;
        }
        if ("left".equals(str)) {
            c0441j.setGravityHorizontal(SET_MOST_RECENT_EVENT_COUNT);
            return;
        }
        if ("right".equals(str)) {
            c0441j.setGravityHorizontal(5);
            return;
        }
        if ("center".equals(str)) {
            c0441j.setGravityHorizontal(1);
            return;
        }
        Y.a.I("ReactNative", "Invalid textAlign: " + str);
        c0441j.setGravityHorizontal(0);
    }

    @L1.a(name = "textAlignVertical")
    public void setTextAlignVertical(C0441j c0441j, String str) {
        if (str == null || "auto".equals(str)) {
            c0441j.setGravityVertical(0);
            return;
        }
        if ("top".equals(str)) {
            c0441j.setGravityVertical(48);
            return;
        }
        if ("bottom".equals(str)) {
            c0441j.setGravityVertical(80);
            return;
        }
        if ("center".equals(str)) {
            c0441j.setGravityVertical(PASSWORD_VISIBILITY_FLAG);
            return;
        }
        Y.a.I("ReactNative", "Invalid textAlignVertical: " + str);
        c0441j.setGravityVertical(0);
    }

    @L1.a(name = "autoComplete")
    public void setTextContentType(C0441j c0441j, String str) {
        if (str == null) {
            setImportantForAutofill(c0441j, 2);
            return;
        }
        if ("off".equals(str)) {
            setImportantForAutofill(c0441j, 2);
            return;
        }
        Map<String, String> map = REACT_PROPS_AUTOFILL_HINTS_MAP;
        if (map.containsKey(str)) {
            setAutofillHints(c0441j, map.get(str));
            return;
        }
        Y.a.I("ReactNative", "Invalid autoComplete: " + str);
        setImportantForAutofill(c0441j, 2);
    }

    @L1.a(name = "textDecorationLine")
    public void setTextDecorationLine(C0441j c0441j, String str) {
        c0441j.setPaintFlags(c0441j.getPaintFlags() & (-25));
        if (str == null) {
            return;
        }
        for (String str2 : str.split(" ")) {
            if (str2.equals("underline")) {
                c0441j.setPaintFlags(c0441j.getPaintFlags() | 8);
            } else if (str2.equals("line-through")) {
                c0441j.setPaintFlags(c0441j.getPaintFlags() | PASSWORD_VISIBILITY_FLAG);
            }
        }
    }

    @L1.a(customType = "Color", name = "underlineColorAndroid")
    public void setUnderlineColor(C0441j c0441j, Integer num) {
        Drawable background = c0441j.getBackground();
        if (background == null) {
            return;
        }
        if (background.getConstantState() != null) {
            try {
                background = background.mutate();
            } catch (NullPointerException e4) {
                Y.a.n(TAG, "NullPointerException when setting underlineColorAndroid for TextInput", e4);
            }
        }
        if (num == null) {
            background.clearColorFilter();
        } else {
            background.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    @L1.a(defaultBoolean = true, name = "showSoftInputOnFocus")
    public void showKeyboardOnFocus(C0441j c0441j, boolean z3) {
        c0441j.setShowSoftInputOnFocus(z3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(final B0 b4, final C0441j c0441j) {
        c0441j.setEventDispatcher(getEventDispatcher(b4, c0441j));
        c0441j.addTextChangedListener(new e(b4, c0441j));
        c0441j.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.facebook.react.views.textinput.E
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z3) {
                ReactTextInputManager.lambda$addEventEmitters$0(b4, c0441j, view, z3);
            }
        });
        c0441j.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.facebook.react.views.textinput.F
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i3, KeyEvent keyEvent) {
                return ReactTextInputManager.lambda$addEventEmitters$1(c0441j, b4, textView, i3, keyEvent);
            }
        });
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public com.facebook.react.views.text.c createShadowNodeInstance() {
        return new H();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C0441j createViewInstance(B0 b4) {
        C0441j c0441j = new C0441j(b4);
        c0441j.setInputType(c0441j.getInputType() & (-131073));
        c0441j.setReturnKeyType("done");
        c0441j.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return c0441j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(C0441j c0441j) {
        super.onAfterUpdateTransaction(c0441j);
        c0441j.Q();
        c0441j.y();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void setPadding(C0441j c0441j, int i3, int i4, int i5, int i6) {
        c0441j.setPadding(i3, i4, i5, i6);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(C0441j c0441j, Object obj) {
        if (obj instanceof com.facebook.react.views.text.i) {
            com.facebook.react.views.text.i iVar = (com.facebook.react.views.text.i) obj;
            int iF = (int) iVar.f();
            int iH = (int) iVar.h();
            int iG = (int) iVar.g();
            int iE = (int) iVar.e();
            int length = UNSET;
            if (iF != UNSET || iH != UNSET || iG != UNSET || iE != UNSET) {
                if (iF == UNSET) {
                    iF = c0441j.getPaddingLeft();
                }
                if (iH == UNSET) {
                    iH = c0441j.getPaddingTop();
                }
                if (iG == UNSET) {
                    iG = c0441j.getPaddingRight();
                }
                if (iE == UNSET) {
                    iE = c0441j.getPaddingBottom();
                }
                c0441j.setPadding(iF, iH, iG, iE);
            }
            if (iVar.b()) {
                Z1.p.g(iVar.i(), c0441j);
            }
            if (c0441j.getSelectionStart() == c0441j.getSelectionEnd()) {
                length = iVar.i().length() - ((c0441j.getText() != null ? c0441j.getText().length() : 0) - c0441j.getSelectionStart());
            }
            c0441j.P(iVar);
            c0441j.M(iVar.c(), length, length);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(C0441j c0441j, C0417s0 c0417s0, A0 a4) {
        if (C0441j.f8104P) {
            Y.a.m(TAG, "updateState: [" + c0441j.getId() + "]");
        }
        if (c0441j.getStateWrapper() == null) {
            c0441j.setPadding(0, 0, 0, 0);
        }
        c0441j.setStateWrapper(a4);
        ReadableMapBuffer readableMapBufferE = a4.e();
        if (readableMapBufferE != null) {
            return getReactTextUpdate(c0441j, c0417s0, readableMapBufferE);
        }
        return null;
    }

    public com.facebook.react.views.text.c createShadowNodeInstance(com.facebook.react.views.text.o oVar) {
        return new H(oVar);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(C0441j c0441j, int i3, ReadableArray readableArray) {
        if (i3 == 1) {
            receiveCommand(c0441j, "focus", readableArray);
        } else if (i3 == 2) {
            receiveCommand(c0441j, "blur", readableArray);
        } else {
            if (i3 != SET_TEXT_AND_SELECTION) {
                return;
            }
            receiveCommand(c0441j, "setTextAndSelection", readableArray);
        }
    }

    public Object getReactTextUpdate(C0441j c0441j, C0417s0 c0417s0, com.facebook.react.common.mapbuffer.a aVar) {
        if (aVar.getCount() == 0) {
            return null;
        }
        com.facebook.react.common.mapbuffer.a aVarD = aVar.d(0);
        return com.facebook.react.views.text.i.a(com.facebook.react.views.text.t.g(c0441j.getContext(), aVarD, null), aVar.getInt(SET_MOST_RECENT_EVENT_COUNT), com.facebook.react.views.text.r.l(c0417s0, com.facebook.react.views.text.t.l(aVarD), c0441j.getGravityHorizontal()), com.facebook.react.views.text.r.m(aVar.d(1).getString(2)), com.facebook.react.views.text.r.h(c0417s0, Build.VERSION.SDK_INT >= 26 ? c0441j.getJustificationMode() : 0));
    }

    private void setImportantForAutofill(C0441j c0441j, int i3) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        c0441j.setImportantForAutofill(i3);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(C0441j c0441j, String str, ReadableArray readableArray) {
        byte b4;
        str.hashCode();
        switch (str.hashCode()) {
            case -1699362314:
                b4 = !str.equals("blurTextInput") ? UNSET : (byte) 0;
                break;
            case 3027047:
                b4 = !str.equals("blur") ? UNSET : (byte) 1;
                break;
            case 97604824:
                b4 = !str.equals("focus") ? UNSET : (byte) 2;
                break;
            case 1427010500:
                b4 = !str.equals("setTextAndSelection") ? UNSET : SET_MOST_RECENT_EVENT_COUNT;
                break;
            case 1690703013:
                b4 = !str.equals("focusTextInput") ? UNSET : (byte) 4;
                break;
            default:
                b4 = UNSET;
                break;
        }
        switch (b4) {
            case WebSettingsBoundaryInterface.ForceDarkBehavior.FORCE_DARK_ONLY /* 0 */:
            case 1:
                c0441j.x();
                break;
            case 2:
            case SET_TEXT_AND_SELECTION /* 4 */:
                c0441j.S();
                break;
            case SET_MOST_RECENT_EVENT_COUNT /* 3 */:
                int i3 = readableArray.getInt(0);
                if (i3 != UNSET) {
                    int i4 = readableArray.getInt(2);
                    int i5 = readableArray.getInt(SET_MOST_RECENT_EVENT_COUNT);
                    if (i5 == UNSET) {
                        i5 = i4;
                    }
                    if (!readableArray.isNull(1)) {
                        c0441j.O(getReactTextUpdate(readableArray.getString(1), i3));
                    }
                    c0441j.M(i3, i4, i5);
                    break;
                }
                break;
        }
    }
}
