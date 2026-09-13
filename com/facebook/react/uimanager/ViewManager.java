package com.facebook.react.uimanager;

import android.content.Context;
import android.view.View;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.InterfaceC0414q0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;

/* JADX INFO: loaded from: classes.dex */
public abstract class ViewManager<T extends View, C extends InterfaceC0414q0> extends BaseJavaModule {
    private static final String TAG = "ViewManager";
    private Q0 mDelegate;
    private HashMap<Integer, Stack<T>> mRecyclableViews;

    public ViewManager() {
        super(null);
        this.mDelegate = null;
        this.mRecyclableViews = null;
    }

    private Q0 getOrCreateViewManagerDelegate() {
        Q0 q3 = this.mDelegate;
        if (q3 != null) {
            return q3;
        }
        Q0 delegate = getDelegate();
        this.mDelegate = delegate;
        return delegate;
    }

    private Stack<T> getRecyclableViewStack(int i3, boolean z3) {
        HashMap<Integer, Stack<T>> map = this.mRecyclableViews;
        if (map == null) {
            return null;
        }
        if (z3 && !map.containsKey(Integer.valueOf(i3))) {
            this.mRecyclableViews.put(Integer.valueOf(i3), new Stack<>());
        }
        return this.mRecyclableViews.get(Integer.valueOf(i3));
    }

    protected void addEventEmitters(B0 b4, T t3) {
    }

    public C createShadowNodeInstance() {
        throw new RuntimeException("ViewManager subclasses must implement createShadowNodeInstance()");
    }

    public T createView(int i3, B0 b4, C0417s0 c0417s0, A0 a4, K1.a aVar) {
        T t3 = (T) createViewInstance(i3, b4, c0417s0, a4);
        if (t3 instanceof K1.d) {
            ((K1.d) t3).setOnInterceptTouchEventListener(aVar);
        }
        return t3;
    }

    protected T createViewInstance(int i3, B0 b4, C0417s0 c0417s0, A0 a4) {
        Object objUpdateState;
        Stack<T> recyclableViewStack = getRecyclableViewStack(b4.c(), true);
        T t3 = (recyclableViewStack == null || recyclableViewStack.empty()) ? (T) createViewInstance(b4) : (T) recycleView(b4, recyclableViewStack.pop());
        t3.setId(i3);
        addEventEmitters(b4, t3);
        if (c0417s0 != null) {
            updateProperties(t3, c0417s0);
        }
        if (a4 != null && (objUpdateState = updateState(t3, c0417s0, a4)) != null) {
            updateExtraData(t3, objUpdateState);
        }
        return t3;
    }

    protected abstract T createViewInstance(B0 b4);

    protected boolean experimental_isPrefetchingEnabled() {
        return p070r1.b.g();
    }

    public void experimental_prefetchResource(ReactContext reactContext, int i3, int i4, com.facebook.react.common.mapbuffer.a aVar) {
    }

    public Map<String, Integer> getCommandsMap() {
        return null;
    }

    protected Q0 getDelegate() {
        if (this instanceof W0) {
            ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException("ViewManager using codegen must override getDelegate method (name: " + getName() + ")."));
        }
        return new R0.c(this);
    }

    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        return null;
    }

    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return null;
    }

    public Map<String, Object> getExportedViewConstants() {
        return null;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public abstract String getName();

    public Map<String, String> getNativeProps() {
        return R0.f(getClass(), getShadowNodeClass());
    }

    public abstract Class<? extends C> getShadowNodeClass();

    public long measure(Context context, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f3, com.facebook.yoga.p pVar, float f4, com.facebook.yoga.p pVar2, float[] fArr) {
        return 0L;
    }

    protected void onAfterUpdateTransaction(T t3) {
    }

    public void onDropViewInstance(T t3) {
        View viewPrepareToRecycleView;
        Context context = t3.getContext();
        if (context == null) {
            Y.a.m(TAG, "onDropViewInstance: view [" + t3.getId() + "] has a null context");
            return;
        }
        if (context instanceof B0) {
            B0 b4 = (B0) context;
            Stack<T> recyclableViewStack = getRecyclableViewStack(b4.c(), false);
            if (recyclableViewStack == null || (viewPrepareToRecycleView = prepareToRecycleView(b4, t3)) == null) {
                return;
            }
            recyclableViewStack.push(viewPrepareToRecycleView);
            return;
        }
        Y.a.m(TAG, "onDropViewInstance: view [" + t3.getId() + "] has a context that is not a ThemedReactContext: " + context);
    }

    public void onSurfaceStopped(int i3) {
        HashMap<Integer, Stack<T>> map = this.mRecyclableViews;
        if (map != null) {
            map.remove(Integer.valueOf(i3));
        }
    }

    protected abstract T prepareToRecycleView(B0 b4, T t3);

    @Deprecated
    public void receiveCommand(T t3, int i3, ReadableArray readableArray) {
    }

    protected T recycleView(B0 b4, T t3) {
        return t3;
    }

    public void setPadding(T t3, int i3, int i4, int i5, int i6) {
    }

    protected void setupViewRecycling() {
        if (p070r1.b.j()) {
            this.mRecyclableViews = new HashMap<>();
        }
    }

    void trimMemory() {
        if (this.mRecyclableViews != null) {
            this.mRecyclableViews = new HashMap<>();
        }
    }

    public abstract void updateExtraData(T t3, Object obj);

    public void updateProperties(T t3, C0417s0 c0417s0) {
        Q0 orCreateViewManagerDelegate = getOrCreateViewManagerDelegate();
        Iterator<Map.Entry<String, Object>> entryIterator = c0417s0.f7631a.getEntryIterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Object> next = entryIterator.next();
            orCreateViewManagerDelegate.b(t3, next.getKey(), next.getValue());
        }
        onAfterUpdateTransaction(t3);
    }

    public Object updateState(T t3, C0417s0 c0417s0, A0 a4) {
        return null;
    }

    public C createShadowNodeInstance(ReactApplicationContext reactApplicationContext) {
        return (C) createShadowNodeInstance();
    }

    public long measure(Context context, com.facebook.react.common.mapbuffer.a aVar, com.facebook.react.common.mapbuffer.a aVar2, com.facebook.react.common.mapbuffer.a aVar3, float f3, com.facebook.yoga.p pVar, float f4, com.facebook.yoga.p pVar2, float[] fArr) {
        return 0L;
    }

    public void receiveCommand(T t3, String str, ReadableArray readableArray) {
        getOrCreateViewManagerDelegate().a(t3, str, readableArray);
    }

    public ViewManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mDelegate = null;
        this.mRecyclableViews = null;
    }
}
