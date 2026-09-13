package com.reactnativecommunity.asyncstorage;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import android.os.AsyncTask;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@p086v1.a(name = "RNCAsyncStorage")
public final class AsyncStorageModule extends NativeAsyncStorageModuleSpec {
    private static final int MAX_SQL_KEYS = 999;
    public static final String NAME = "RNCAsyncStorage";
    private final l executor;
    private k mReactDatabaseSupplier;
    private boolean mShuttingDown;

    class a extends GuardedAsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callback f8420a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ReadableArray f8421b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ReactContext reactContext, Callback callback, ReadableArray readableArray) {
            super(reactContext);
            this.f8420a = callback;
            this.f8421b = readableArray;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void doInBackgroundGuarded(Void... voidArr) {
            if (!AsyncStorageModule.this.ensureDatabase()) {
                this.f8420a.invoke(com.reactnativecommunity.asyncstorage.b.a(null), null);
                return;
            }
            String[] strArr = {"key", "value"};
            HashSet<String> hashSet = new HashSet();
            WritableArray writableArrayCreateArray = Arguments.createArray();
            for (int i3 = 0; i3 < this.f8421b.size(); i3 += AsyncStorageModule.MAX_SQL_KEYS) {
                int iMin = Math.min(this.f8421b.size() - i3, AsyncStorageModule.MAX_SQL_KEYS);
                Cursor cursorQuery = AsyncStorageModule.this.mReactDatabaseSupplier.y().query("catalystLocalStorage", strArr, com.reactnativecommunity.asyncstorage.a.a(iMin), com.reactnativecommunity.asyncstorage.a.b(this.f8421b, i3, iMin), null, null, null);
                hashSet.clear();
                try {
                    try {
                        if (cursorQuery.getCount() != this.f8421b.size()) {
                            for (int i4 = i3; i4 < i3 + iMin; i4++) {
                                hashSet.add(this.f8421b.getString(i4));
                            }
                        }
                        if (cursorQuery.moveToFirst()) {
                            do {
                                WritableArray writableArrayCreateArray2 = Arguments.createArray();
                                writableArrayCreateArray2.pushString(cursorQuery.getString(0));
                                writableArrayCreateArray2.pushString(cursorQuery.getString(1));
                                writableArrayCreateArray.pushArray(writableArrayCreateArray2);
                                hashSet.remove(cursorQuery.getString(0));
                            } while (cursorQuery.moveToNext());
                        }
                        cursorQuery.close();
                        for (String str : hashSet) {
                            WritableArray writableArrayCreateArray3 = Arguments.createArray();
                            writableArrayCreateArray3.pushString(str);
                            writableArrayCreateArray3.pushNull();
                            writableArrayCreateArray.pushArray(writableArrayCreateArray3);
                        }
                        hashSet.clear();
                    } catch (Exception e4) {
                        Y.a.J("ReactNative", e4.getMessage(), e4);
                        this.f8420a.invoke(com.reactnativecommunity.asyncstorage.b.b(null, e4.getMessage()), null);
                        cursorQuery.close();
                        return;
                    }
                } catch (Throwable th) {
                    cursorQuery.close();
                    throw th;
                }
            }
            this.f8420a.invoke(null, writableArrayCreateArray);
        }
    }

    class b extends GuardedAsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callback f8423a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ReadableArray f8424b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ReactContext reactContext, Callback callback, ReadableArray readableArray) {
            super(reactContext);
            this.f8423a = callback;
            this.f8424b = readableArray;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Code duplicated, block: B:58:0x015b  */
        /* JADX WARN: Code duplicated, block: B:59:0x0165  */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void doInBackgroundGuarded(Void... voidArr) {
            WritableMap writableMapB = null;
            if (!AsyncStorageModule.this.ensureDatabase()) {
                this.f8423a.invoke(com.reactnativecommunity.asyncstorage.b.a(null));
                return;
            }
            SQLiteStatement sQLiteStatementCompileStatement = AsyncStorageModule.this.mReactDatabaseSupplier.y().compileStatement("INSERT OR REPLACE INTO catalystLocalStorage VALUES (?, ?);");
            try {
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.y().beginTransaction();
                    for (int i3 = 0; i3 < this.f8424b.size(); i3++) {
                        if (this.f8424b.getArray(i3).size() != 2) {
                            WritableMap writableMapD = com.reactnativecommunity.asyncstorage.b.d(null);
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.y().endTransaction();
                                return;
                            } catch (Exception e4) {
                                Y.a.J("ReactNative", e4.getMessage(), e4);
                                if (writableMapD == null) {
                                    com.reactnativecommunity.asyncstorage.b.b(null, e4.getMessage());
                                    return;
                                }
                                return;
                            }
                        }
                        if (this.f8424b.getArray(i3).getString(0) == null) {
                            WritableMap writableMapC = com.reactnativecommunity.asyncstorage.b.c(null);
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.y().endTransaction();
                                return;
                            } catch (Exception e5) {
                                Y.a.J("ReactNative", e5.getMessage(), e5);
                                if (writableMapC == null) {
                                    com.reactnativecommunity.asyncstorage.b.b(null, e5.getMessage());
                                    return;
                                }
                                return;
                            }
                        }
                        if (this.f8424b.getArray(i3).getString(1) == null) {
                            WritableMap writableMapD2 = com.reactnativecommunity.asyncstorage.b.d(null);
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.y().endTransaction();
                                return;
                            } catch (Exception e6) {
                                Y.a.J("ReactNative", e6.getMessage(), e6);
                                if (writableMapD2 == null) {
                                    com.reactnativecommunity.asyncstorage.b.b(null, e6.getMessage());
                                    return;
                                }
                                return;
                            }
                        }
                        sQLiteStatementCompileStatement.clearBindings();
                        sQLiteStatementCompileStatement.bindString(1, this.f8424b.getArray(i3).getString(0));
                        sQLiteStatementCompileStatement.bindString(2, this.f8424b.getArray(i3).getString(1));
                        sQLiteStatementCompileStatement.execute();
                    }
                    AsyncStorageModule.this.mReactDatabaseSupplier.y().setTransactionSuccessful();
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.y().endTransaction();
                    } catch (Exception e7) {
                        Y.a.J("ReactNative", e7.getMessage(), e7);
                        writableMapB = com.reactnativecommunity.asyncstorage.b.b(null, e7.getMessage());
                    }
                } catch (Exception e8) {
                    Y.a.J("ReactNative", e8.getMessage(), e8);
                    WritableMap writableMapB2 = com.reactnativecommunity.asyncstorage.b.b(null, e8.getMessage());
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.y().endTransaction();
                    } catch (Exception e9) {
                        Y.a.J("ReactNative", e9.getMessage(), e9);
                        if (writableMapB2 == null) {
                            writableMapB = com.reactnativecommunity.asyncstorage.b.b(null, e9.getMessage());
                        }
                        if (writableMapB != null) {
                            this.f8423a.invoke(writableMapB);
                        } else {
                            this.f8423a.invoke(new Object[0]);
                        }
                    }
                    writableMapB = writableMapB2;
                }
                if (writableMapB != null) {
                    this.f8423a.invoke(writableMapB);
                } else {
                    this.f8423a.invoke(new Object[0]);
                }
            } catch (Throwable th) {
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.y().endTransaction();
                } catch (Exception e10) {
                    Y.a.J("ReactNative", e10.getMessage(), e10);
                    com.reactnativecommunity.asyncstorage.b.b(null, e10.getMessage());
                }
                throw th;
            }
        }
    }

    class c extends GuardedAsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callback f8426a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ReadableArray f8427b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ReactContext reactContext, Callback callback, ReadableArray readableArray) {
            super(reactContext);
            this.f8426a = callback;
            this.f8427b = readableArray;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Code duplicated, block: B:28:0x00bd  */
        /* JADX WARN: Code duplicated, block: B:29:0x00c7  */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void doInBackgroundGuarded(Void... voidArr) {
            WritableMap writableMapB = null;
            if (!AsyncStorageModule.this.ensureDatabase()) {
                this.f8426a.invoke(com.reactnativecommunity.asyncstorage.b.a(null));
                return;
            }
            try {
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.y().beginTransaction();
                    for (int i3 = 0; i3 < this.f8427b.size(); i3 += AsyncStorageModule.MAX_SQL_KEYS) {
                        int iMin = Math.min(this.f8427b.size() - i3, AsyncStorageModule.MAX_SQL_KEYS);
                        AsyncStorageModule.this.mReactDatabaseSupplier.y().delete("catalystLocalStorage", com.reactnativecommunity.asyncstorage.a.a(iMin), com.reactnativecommunity.asyncstorage.a.b(this.f8427b, i3, iMin));
                    }
                    AsyncStorageModule.this.mReactDatabaseSupplier.y().setTransactionSuccessful();
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.y().endTransaction();
                    } catch (Exception e4) {
                        Y.a.J("ReactNative", e4.getMessage(), e4);
                        writableMapB = com.reactnativecommunity.asyncstorage.b.b(null, e4.getMessage());
                    }
                } catch (Throwable th) {
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.y().endTransaction();
                    } catch (Exception e5) {
                        Y.a.J("ReactNative", e5.getMessage(), e5);
                        com.reactnativecommunity.asyncstorage.b.b(null, e5.getMessage());
                    }
                    throw th;
                }
            } catch (Exception e6) {
                Y.a.J("ReactNative", e6.getMessage(), e6);
                WritableMap writableMapB2 = com.reactnativecommunity.asyncstorage.b.b(null, e6.getMessage());
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.y().endTransaction();
                } catch (Exception e7) {
                    Y.a.J("ReactNative", e7.getMessage(), e7);
                    if (writableMapB2 == null) {
                        writableMapB = com.reactnativecommunity.asyncstorage.b.b(null, e7.getMessage());
                    }
                    if (writableMapB != null) {
                        this.f8426a.invoke(writableMapB);
                    } else {
                        this.f8426a.invoke(new Object[0]);
                    }
                }
                writableMapB = writableMapB2;
            }
            if (writableMapB != null) {
                this.f8426a.invoke(writableMapB);
            } else {
                this.f8426a.invoke(new Object[0]);
            }
        }
    }

    class d extends GuardedAsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callback f8429a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ReadableArray f8430b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ReactContext reactContext, Callback callback, ReadableArray readableArray) {
            super(reactContext);
            this.f8429a = callback;
            this.f8430b = readableArray;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Code duplicated, block: B:68:0x0173  */
        /* JADX WARN: Code duplicated, block: B:69:0x017d  */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void doInBackgroundGuarded(Void... voidArr) {
            WritableMap writableMapB = null;
            if (!AsyncStorageModule.this.ensureDatabase()) {
                this.f8429a.invoke(com.reactnativecommunity.asyncstorage.b.a(null));
                return;
            }
            try {
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.y().beginTransaction();
                    for (int i3 = 0; i3 < this.f8430b.size(); i3++) {
                        if (this.f8430b.getArray(i3).size() != 2) {
                            WritableMap writableMapD = com.reactnativecommunity.asyncstorage.b.d(null);
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.y().endTransaction();
                                return;
                            } catch (Exception e4) {
                                Y.a.J("ReactNative", e4.getMessage(), e4);
                                if (writableMapD == null) {
                                    com.reactnativecommunity.asyncstorage.b.b(null, e4.getMessage());
                                    return;
                                }
                                return;
                            }
                        }
                        if (this.f8430b.getArray(i3).getString(0) == null) {
                            WritableMap writableMapC = com.reactnativecommunity.asyncstorage.b.c(null);
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.y().endTransaction();
                                return;
                            } catch (Exception e5) {
                                Y.a.J("ReactNative", e5.getMessage(), e5);
                                if (writableMapC == null) {
                                    com.reactnativecommunity.asyncstorage.b.b(null, e5.getMessage());
                                    return;
                                }
                                return;
                            }
                        }
                        if (this.f8430b.getArray(i3).getString(1) == null) {
                            WritableMap writableMapD2 = com.reactnativecommunity.asyncstorage.b.d(null);
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.y().endTransaction();
                                return;
                            } catch (Exception e6) {
                                Y.a.J("ReactNative", e6.getMessage(), e6);
                                if (writableMapD2 == null) {
                                    com.reactnativecommunity.asyncstorage.b.b(null, e6.getMessage());
                                    return;
                                }
                                return;
                            }
                        }
                        if (!com.reactnativecommunity.asyncstorage.a.e(AsyncStorageModule.this.mReactDatabaseSupplier.y(), this.f8430b.getArray(i3).getString(0), this.f8430b.getArray(i3).getString(1))) {
                            WritableMap writableMapA = com.reactnativecommunity.asyncstorage.b.a(null);
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.y().endTransaction();
                                return;
                            } catch (Exception e7) {
                                Y.a.J("ReactNative", e7.getMessage(), e7);
                                if (writableMapA == null) {
                                    com.reactnativecommunity.asyncstorage.b.b(null, e7.getMessage());
                                    return;
                                }
                                return;
                            }
                        }
                    }
                    AsyncStorageModule.this.mReactDatabaseSupplier.y().setTransactionSuccessful();
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.y().endTransaction();
                    } catch (Exception e8) {
                        Y.a.J("ReactNative", e8.getMessage(), e8);
                        writableMapB = com.reactnativecommunity.asyncstorage.b.b(null, e8.getMessage());
                    }
                } catch (Exception e9) {
                    Y.a.J("ReactNative", e9.getMessage(), e9);
                    WritableMap writableMapB2 = com.reactnativecommunity.asyncstorage.b.b(null, e9.getMessage());
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.y().endTransaction();
                    } catch (Exception e10) {
                        Y.a.J("ReactNative", e10.getMessage(), e10);
                        if (writableMapB2 == null) {
                            writableMapB = com.reactnativecommunity.asyncstorage.b.b(null, e10.getMessage());
                        }
                        if (writableMapB != null) {
                            this.f8429a.invoke(writableMapB);
                        } else {
                            this.f8429a.invoke(new Object[0]);
                        }
                    }
                    writableMapB = writableMapB2;
                }
                if (writableMapB != null) {
                    this.f8429a.invoke(writableMapB);
                } else {
                    this.f8429a.invoke(new Object[0]);
                }
            } catch (Throwable th) {
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.y().endTransaction();
                } catch (Exception e11) {
                    Y.a.J("ReactNative", e11.getMessage(), e11);
                    com.reactnativecommunity.asyncstorage.b.b(null, e11.getMessage());
                }
                throw th;
            }
        }
    }

    class e extends GuardedAsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callback f8432a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(ReactContext reactContext, Callback callback) {
            super(reactContext);
            this.f8432a = callback;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void doInBackgroundGuarded(Void... voidArr) {
            if (!AsyncStorageModule.this.mReactDatabaseSupplier.v()) {
                this.f8432a.invoke(com.reactnativecommunity.asyncstorage.b.a(null));
                return;
            }
            try {
                AsyncStorageModule.this.mReactDatabaseSupplier.a();
                this.f8432a.invoke(new Object[0]);
            } catch (Exception e4) {
                Y.a.J("ReactNative", e4.getMessage(), e4);
                this.f8432a.invoke(com.reactnativecommunity.asyncstorage.b.b(null, e4.getMessage()));
            }
        }
    }

    class f extends GuardedAsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callback f8434a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(ReactContext reactContext, Callback callback) {
            super(reactContext);
            this.f8434a = callback;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void doInBackgroundGuarded(Void... voidArr) {
            if (!AsyncStorageModule.this.ensureDatabase()) {
                this.f8434a.invoke(com.reactnativecommunity.asyncstorage.b.a(null), null);
                return;
            }
            WritableArray writableArrayCreateArray = Arguments.createArray();
            Cursor cursorQuery = AsyncStorageModule.this.mReactDatabaseSupplier.y().query("catalystLocalStorage", new String[]{"key"}, null, null, null, null, null);
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        do {
                            writableArrayCreateArray.pushString(cursorQuery.getString(0));
                        } while (cursorQuery.moveToNext());
                    }
                    cursorQuery.close();
                    this.f8434a.invoke(null, writableArrayCreateArray);
                } catch (Exception e4) {
                    Y.a.J("ReactNative", e4.getMessage(), e4);
                    this.f8434a.invoke(com.reactnativecommunity.asyncstorage.b.b(null, e4.getMessage()), null);
                    cursorQuery.close();
                }
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
    }

    public AsyncStorageModule(ReactApplicationContext reactApplicationContext) {
        this(reactApplicationContext, AsyncTask.THREAD_POOL_EXECUTOR);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ensureDatabase() {
        return !this.mShuttingDown && this.mReactDatabaseSupplier.v();
    }

    @Override // com.reactnativecommunity.asyncstorage.NativeAsyncStorageModuleSpec
    @ReactMethod
    public void clear(Callback callback) {
        new e(getReactApplicationContext(), callback).executeOnExecutor(this.executor, new Void[0]);
    }

    public void clearSensitiveData() {
        this.mReactDatabaseSupplier.i();
    }

    @Override // com.reactnativecommunity.asyncstorage.NativeAsyncStorageModuleSpec
    @ReactMethod
    public void getAllKeys(Callback callback) {
        new f(getReactApplicationContext(), callback).executeOnExecutor(this.executor, new Void[0]);
    }

    @Override // com.reactnativecommunity.asyncstorage.NativeAsyncStorageModuleSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNCAsyncStorage";
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        this.mShuttingDown = false;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        this.mShuttingDown = true;
        this.mReactDatabaseSupplier.o();
    }

    @Override // com.reactnativecommunity.asyncstorage.NativeAsyncStorageModuleSpec
    @ReactMethod
    public void multiGet(ReadableArray readableArray, Callback callback) {
        if (readableArray == null) {
            callback.invoke(com.reactnativecommunity.asyncstorage.b.c(null), null);
        } else {
            new a(getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
        }
    }

    @Override // com.reactnativecommunity.asyncstorage.NativeAsyncStorageModuleSpec
    @ReactMethod
    public void multiMerge(ReadableArray readableArray, Callback callback) {
        new d(getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
    }

    @Override // com.reactnativecommunity.asyncstorage.NativeAsyncStorageModuleSpec
    @ReactMethod
    public void multiRemove(ReadableArray readableArray, Callback callback) {
        if (readableArray.size() == 0) {
            callback.invoke(new Object[0]);
        } else {
            new c(getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
        }
    }

    @Override // com.reactnativecommunity.asyncstorage.NativeAsyncStorageModuleSpec
    @ReactMethod
    public void multiSet(ReadableArray readableArray, Callback callback) {
        if (readableArray.size() == 0) {
            callback.invoke(new Object[0]);
        } else {
            new b(getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
        }
    }

    AsyncStorageModule(ReactApplicationContext reactApplicationContext, Executor executor) throws Throwable {
        super(reactApplicationContext);
        this.mShuttingDown = false;
        h.g(reactApplicationContext);
        this.executor = new l(executor);
        this.mReactDatabaseSupplier = k.z(reactApplicationContext);
    }
}
