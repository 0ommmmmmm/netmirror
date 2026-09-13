package com.facebook.react.modules.websocket;

import D2.h;
import D2.u;
import K2.o;
import M2.B;
import M2.D;
import M2.H;
import M2.I;
import M2.z;
import b3.l;
import com.facebook.fbreact.specs.NativeWebSocketModuleSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.network.d;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@p086v1.a(name = "WebSocketModule")
public final class WebSocketModule extends NativeWebSocketModuleSpec {
    public static final a Companion = new a(null);
    public static final String NAME = "WebSocketModule";
    private static com.facebook.react.modules.network.b customClientBuilder;
    private final Map<Integer, b> contentHandlers;
    private final d cookieHandler;
    private final Map<Integer, H> webSocketConnections;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void c(z.a aVar) {
            WebSocketModule.access$getCustomClientBuilder$cp();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:20:0x0035 A[Catch: URISyntaxException -> 0x0092, TryCatch #0 {URISyntaxException -> 0x0092, blocks: (B:2:0x0000, B:4:0x000b, B:14:0x0027, B:20:0x0035, B:28:0x004f, B:31:0x0058, B:32:0x0079, B:17:0x002e, B:21:0x003a, B:25:0x0045), top: B:36:0x0000 }] */
        /* JADX WARN: Code duplicated, block: B:27:0x004d  */
        public final String d(String str) {
            String scheme;
            try {
                URI uri = new URI(str);
                String scheme2 = uri.getScheme();
                if (scheme2 != null) {
                    int iHashCode = scheme2.hashCode();
                    scheme = "http";
                    if (iHashCode != 3804) {
                        if (iHashCode != 118039) {
                            if (iHashCode != 3213448) {
                                if (iHashCode == 99617003 && scheme2.equals("https")) {
                                    scheme = uri.getScheme();
                                } else {
                                    scheme = "";
                                }
                            } else if (scheme2.equals("http")) {
                                scheme = uri.getScheme();
                            } else {
                                scheme = "";
                            }
                        } else if (scheme2.equals("wss")) {
                            scheme = "https";
                        } else {
                            scheme = "";
                        }
                    } else if (!scheme2.equals("ws")) {
                        scheme = "";
                    }
                } else {
                    scheme = "";
                }
                if (uri.getPort() != -1) {
                    u uVar = u.f192a;
                    String str2 = String.format("%s://%s:%s", Arrays.copyOf(new Object[]{scheme, uri.getHost(), Integer.valueOf(uri.getPort())}, 3));
                    h.e(str2, "format(...)");
                    return str2;
                }
                u uVar2 = u.f192a;
                String str3 = String.format("%s://%s", Arrays.copyOf(new Object[]{scheme, uri.getHost()}, 2));
                h.e(str3, "format(...)");
                return str3;
            } catch (URISyntaxException unused) {
                throw new IllegalArgumentException("Unable to set " + str + " as default origin header");
            }
        }

        public final void e(com.facebook.react.modules.network.b bVar) {
            WebSocketModule.access$setCustomClientBuilder$cp(bVar);
        }

        private a() {
        }
    }

    public interface b {
        void a(l lVar, WritableMap writableMap);

        void b(String str, WritableMap writableMap);
    }

    public static final class c extends I {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f7053b;

        c(int i3) {
            this.f7053b = i3;
        }

        @Override // M2.I
        public void a(H h3, int i3, String str) {
            h.f(h3, "webSocket");
            h.f(str, "reason");
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putInt("id", this.f7053b);
            writableMapCreateMap.putInt("code", i3);
            writableMapCreateMap.putString("reason", str);
            WebSocketModule webSocketModule = WebSocketModule.this;
            h.c(writableMapCreateMap);
            webSocketModule.sendEvent("websocketClosed", writableMapCreateMap);
        }

        @Override // M2.I
        public void b(H h3, int i3, String str) {
            h.f(h3, "websocket");
            h.f(str, "reason");
            h3.a(i3, str);
        }

        @Override // M2.I
        public void c(H h3, Throwable th, D d4) {
            h.f(h3, "webSocket");
            h.f(th, "t");
            WebSocketModule.this.notifyWebSocketFailed(this.f7053b, th.getMessage());
        }

        @Override // M2.I
        public void d(H h3, l lVar) {
            h.f(h3, "webSocket");
            h.f(lVar, "bytes");
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putInt("id", this.f7053b);
            writableMapCreateMap.putString("type", "binary");
            b bVar = (b) WebSocketModule.this.contentHandlers.get(Integer.valueOf(this.f7053b));
            if (bVar != null) {
                h.c(writableMapCreateMap);
                bVar.a(lVar, writableMapCreateMap);
            } else {
                writableMapCreateMap.putString("data", lVar.a());
            }
            WebSocketModule webSocketModule = WebSocketModule.this;
            h.c(writableMapCreateMap);
            webSocketModule.sendEvent("websocketMessage", writableMapCreateMap);
        }

        @Override // M2.I
        public void e(H h3, String str) {
            h.f(h3, "webSocket");
            h.f(str, "text");
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putInt("id", this.f7053b);
            writableMapCreateMap.putString("type", "text");
            b bVar = (b) WebSocketModule.this.contentHandlers.get(Integer.valueOf(this.f7053b));
            if (bVar != null) {
                h.c(writableMapCreateMap);
                bVar.b(str, writableMapCreateMap);
            } else {
                writableMapCreateMap.putString("data", str);
            }
            WebSocketModule webSocketModule = WebSocketModule.this;
            h.c(writableMapCreateMap);
            webSocketModule.sendEvent("websocketMessage", writableMapCreateMap);
        }

        @Override // M2.I
        public void f(H h3, D d4) {
            h.f(h3, "webSocket");
            h.f(d4, "response");
            WebSocketModule.this.webSocketConnections.put(Integer.valueOf(this.f7053b), h3);
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putInt("id", this.f7053b);
            writableMapCreateMap.putString("protocol", d4.a0("Sec-WebSocket-Protocol", ""));
            WebSocketModule webSocketModule = WebSocketModule.this;
            h.c(writableMapCreateMap);
            webSocketModule.sendEvent("websocketOpen", writableMapCreateMap);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSocketModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        h.f(reactApplicationContext, "context");
        this.webSocketConnections = new ConcurrentHashMap();
        this.contentHandlers = new ConcurrentHashMap();
        this.cookieHandler = new d();
    }

    public static final /* synthetic */ com.facebook.react.modules.network.b access$getCustomClientBuilder$cp() {
        return null;
    }

    public static final /* synthetic */ void access$setCustomClientBuilder$cp(com.facebook.react.modules.network.b bVar) {
    }

    private final String getCookie(String str) {
        try {
            List list = (List) this.cookieHandler.get(new URI(Companion.d(str)), new HashMap()).get("Cookie");
            if (list != null && !list.isEmpty()) {
                return (String) list.get(0);
            }
            return null;
        } catch (IOException unused) {
            throw new IllegalArgumentException("Unable to get cookie from " + str);
        } catch (URISyntaxException unused2) {
            throw new IllegalArgumentException("Unable to get cookie from " + str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyWebSocketFailed(int i3, String str) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("id", i3);
        writableMapCreateMap.putString("message", str);
        h.c(writableMapCreateMap);
        sendEvent("websocketFailed", writableMapCreateMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendEvent(String str, WritableMap writableMap) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        if (reactApplicationContext.hasActiveReactInstance()) {
            reactApplicationContext.emitDeviceEvent(str, writableMap);
        }
    }

    public static final void setCustomClientBuilder(com.facebook.react.modules.network.b bVar) {
        Companion.e(bVar);
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void addListener(String str) {
        h.f(str, "eventName");
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void close(double d4, String str, double d5) {
        int i3 = (int) d5;
        H h3 = this.webSocketConnections.get(Integer.valueOf(i3));
        if (h3 == null) {
            return;
        }
        try {
            h3.a((int) d4, str);
            this.webSocketConnections.remove(Integer.valueOf(i3));
            this.contentHandlers.remove(Integer.valueOf(i3));
        } catch (Exception e4) {
            Y.a.n("ReactNative", "Could not close WebSocket connection for id " + i3, e4);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void connect(String str, ReadableArray readableArray, ReadableMap readableMap, double d4) {
        boolean z3;
        h.f(str, "url");
        int i3 = (int) d4;
        z.a aVar = new z.a();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        z.a aVarM = aVar.e(10L, timeUnit).N(10L, timeUnit).M(0L, TimeUnit.MINUTES);
        Companion.c(aVarM);
        z zVarB = aVarM.b();
        B.a aVarM2 = new B.a().k(Integer.valueOf(i3)).m(str);
        String cookie = getCookie(str);
        if (cookie != null) {
            aVarM2.a("Cookie", cookie);
        }
        if (readableMap != null && readableMap.hasKey("headers") && readableMap.getType("headers") == ReadableType.Map) {
            ReadableMap map = readableMap.getMap("headers");
            if (map == null) {
                throw new IllegalStateException("Required value was null.");
            }
            ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = map.keySetIterator();
            z3 = false;
            while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                if (ReadableType.String == map.getType(strNextKey)) {
                    if (o.n(strNextKey, "origin", true)) {
                        z3 = true;
                    }
                    String string = map.getString(strNextKey);
                    if (string == null) {
                        throw new IllegalStateException(("value for name " + strNextKey + " == null").toString());
                    }
                    aVarM2.a(strNextKey, string);
                } else {
                    Y.a.I("ReactNative", "Ignoring: requested " + strNextKey + ", value not a string");
                }
            }
        } else {
            z3 = false;
        }
        if (!z3) {
            aVarM2.a("origin", Companion.d(str));
        }
        if (readableArray != null && readableArray.size() > 0) {
            StringBuilder sb = new StringBuilder("");
            int size = readableArray.size();
            for (int i4 = 0; i4 < size; i4++) {
                String string2 = readableArray.getString(i4);
                String string3 = string2 != null ? o.w0(string2).toString() : null;
                if (!(string3 == null || string3.length() == 0) && !o.E(string3, ",", false, 2, null)) {
                    sb.append(string3);
                    sb.append(",");
                }
            }
            if (sb.length() > 0) {
                sb.replace(sb.length() - 1, sb.length(), "");
                String string4 = sb.toString();
                h.e(string4, "toString(...)");
                aVarM2.a("Sec-WebSocket-Protocol", string4);
            }
        }
        zVarB.D(aVarM2.b(), new c(i3));
        zVarB.c().a().shutdown();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        Iterator<H> it = this.webSocketConnections.values().iterator();
        while (it.hasNext()) {
            it.next().a(1001, null);
        }
        this.webSocketConnections.clear();
        this.contentHandlers.clear();
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void ping(double d4) {
        int i3 = (int) d4;
        H h3 = this.webSocketConnections.get(Integer.valueOf(i3));
        if (h3 != null) {
            try {
                h3.f(l.f5639e);
                return;
            } catch (Exception e4) {
                notifyWebSocketFailed(i3, e4.getMessage());
                return;
            }
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        h.e(writableMapCreateMap, "createMap(...)");
        writableMapCreateMap.putInt("id", i3);
        writableMapCreateMap.putString("message", "client is null");
        sendEvent("websocketFailed", writableMapCreateMap);
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putInt("id", i3);
        writableMapCreateMap2.putInt("code", 0);
        writableMapCreateMap2.putString("reason", "client is null");
        sendEvent("websocketClosed", writableMapCreateMap2);
        this.webSocketConnections.remove(Integer.valueOf(i3));
        this.contentHandlers.remove(Integer.valueOf(i3));
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void removeListeners(double d4) {
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void send(String str, double d4) {
        h.f(str, "message");
        int i3 = (int) d4;
        H h3 = this.webSocketConnections.get(Integer.valueOf(i3));
        if (h3 != null) {
            try {
                h3.b(str);
                return;
            } catch (Exception e4) {
                notifyWebSocketFailed(i3, e4.getMessage());
                return;
            }
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        h.e(writableMapCreateMap, "createMap(...)");
        writableMapCreateMap.putInt("id", i3);
        writableMapCreateMap.putString("message", "client is null");
        sendEvent("websocketFailed", writableMapCreateMap);
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putInt("id", i3);
        writableMapCreateMap2.putInt("code", 0);
        writableMapCreateMap2.putString("reason", "client is null");
        sendEvent("websocketClosed", writableMapCreateMap2);
        this.webSocketConnections.remove(Integer.valueOf(i3));
        this.contentHandlers.remove(Integer.valueOf(i3));
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void sendBinary(String str, double d4) {
        h.f(str, "base64String");
        int i3 = (int) d4;
        H h3 = this.webSocketConnections.get(Integer.valueOf(i3));
        if (h3 != null) {
            try {
                l lVarA = l.f5640f.a(str);
                if (lVarA == null) {
                    throw new IllegalStateException("bytes == null");
                }
                h3.f(lVarA);
                return;
            } catch (Exception e4) {
                notifyWebSocketFailed(i3, e4.getMessage());
                return;
            }
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        h.e(writableMapCreateMap, "createMap(...)");
        writableMapCreateMap.putInt("id", i3);
        writableMapCreateMap.putString("message", "client is null");
        sendEvent("websocketFailed", writableMapCreateMap);
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putInt("id", i3);
        writableMapCreateMap2.putInt("code", 0);
        writableMapCreateMap2.putString("reason", "client is null");
        sendEvent("websocketClosed", writableMapCreateMap2);
        this.webSocketConnections.remove(Integer.valueOf(i3));
        this.contentHandlers.remove(Integer.valueOf(i3));
    }

    public final void setContentHandler(int i3, b bVar) {
        if (bVar == null) {
            this.contentHandlers.remove(Integer.valueOf(i3));
        } else {
            this.contentHandlers.put(Integer.valueOf(i3), bVar);
        }
    }

    public final void sendBinary(l lVar, int i3) {
        h.f(lVar, "byteString");
        H h3 = this.webSocketConnections.get(Integer.valueOf(i3));
        if (h3 == null) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            h.e(writableMapCreateMap, "createMap(...)");
            writableMapCreateMap.putInt("id", i3);
            writableMapCreateMap.putString("message", "client is null");
            sendEvent("websocketFailed", writableMapCreateMap);
            WritableMap writableMapCreateMap2 = Arguments.createMap();
            writableMapCreateMap2.putInt("id", i3);
            writableMapCreateMap2.putInt("code", 0);
            writableMapCreateMap2.putString("reason", "client is null");
            sendEvent("websocketClosed", writableMapCreateMap2);
            this.webSocketConnections.remove(Integer.valueOf(i3));
            this.contentHandlers.remove(Integer.valueOf(i3));
            return;
        }
        try {
            h3.f(lVar);
        } catch (Exception e4) {
            notifyWebSocketFailed(i3, e4.getMessage());
        }
    }
}
