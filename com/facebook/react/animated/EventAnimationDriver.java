package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.UnexpectedNativeTypeException;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTModernEventEmitter;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class EventAnimationDriver implements RCTModernEventEmitter {
    public String eventName;
    private final List<String> eventPath;
    public w valueNode;
    public int viewTag;

    public EventAnimationDriver(String str, int i3, List<String> list, w wVar) {
        D2.h.f(str, "eventName");
        D2.h.f(list, "eventPath");
        D2.h.f(wVar, "valueNode");
        this.eventName = str;
        this.viewTag = i3;
        this.eventPath = list;
        this.valueNode = wVar;
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    public void receiveEvent(int i3, String str, WritableMap writableMap) {
        D2.h.f(str, "eventName");
        receiveEvent(-1, i3, str, writableMap);
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    public void receiveTouches(String str, WritableArray writableArray, WritableArray writableArray2) {
        D2.h.f(str, "eventName");
        D2.h.f(writableArray, "touches");
        D2.h.f(writableArray2, "changedIndices");
        throw new UnsupportedOperationException("receiveTouches is not support by native animated events");
    }

    @Override // com.facebook.react.uimanager.events.RCTModernEventEmitter
    public void receiveEvent(int i3, int i4, String str, WritableMap writableMap) {
        D2.h.f(str, "eventName");
        receiveEvent(i3, i4, str, false, 0, writableMap, 2);
    }

    @Override // com.facebook.react.uimanager.events.RCTModernEventEmitter
    public void receiveTouches(P1.q qVar) {
        D2.h.f(qVar, "event");
        throw new UnsupportedOperationException("receiveTouches is not support by native animated events");
    }

    @Override // com.facebook.react.uimanager.events.RCTModernEventEmitter
    public void receiveEvent(int i3, int i4, String str, boolean z3, int i5, WritableMap writableMap, int i6) {
        ReadableMap readableMap;
        ReadableType type;
        ReadableMap map;
        ReadableMap readableMap2;
        D2.h.f(str, "eventName");
        if (writableMap != null) {
            int size = this.eventPath.size() - 1;
            int i7 = 0;
            ReadableArray array = null;
            while (i7 < size) {
                if (readableMap != null) {
                    String str2 = this.eventPath.get(i7);
                    ReadableType type2 = readableMap.getType(str2);
                    if (type2 == ReadableType.Map) {
                        readableMap = writableMap;
                        map = readableMap.getMap(str2);
                        readableMap2 = map;
                        array = null;
                    } else {
                        if (type2 != ReadableType.Array) {
                            readableMap = writableMap;
                            throw new UnexpectedNativeTypeException("Unexpected type " + type2 + " for key '" + str2 + "'");
                        }
                        readableMap = writableMap;
                        array = readableMap.getArray(str2);
                        readableMap2 = null;
                    }
                } else {
                    int i8 = Integer.parseInt(this.eventPath.get(i7));
                    if (array != null) {
                        readableMap = writableMap;
                        type = array.getType(i8);
                    } else {
                        readableMap = writableMap;
                        type = null;
                    }
                    if (type == ReadableType.Map) {
                        map = array != null ? array.getMap(i8) : null;
                        readableMap2 = map;
                        array = null;
                    } else {
                        if (type != ReadableType.Array) {
                            throw new UnexpectedNativeTypeException("Unexpected type " + type + " for index '" + i8 + "'");
                        }
                        array = array != null ? array.getArray(i8) : null;
                        readableMap2 = null;
                    }
                }
                i7++;
                readableMap = readableMap2;
            }
            readableMap = writableMap;
            List<String> list = this.eventPath;
            String str3 = list.get(list.size() - 1);
            if (readableMap != null) {
                this.valueNode.f6496f = readableMap.getDouble(str3);
                return;
            }
            this.valueNode.f6496f = array != null ? array.getDouble(Integer.parseInt(str3)) : 0.0d;
            return;
        }
        throw new IllegalArgumentException("Native animated events must have event data.");
    }
}
