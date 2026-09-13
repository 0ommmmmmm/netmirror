package S0;

import O0.j;
import R0.i;
import R0.r;
import X.k;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import android.os.Build;
import com.facebook.imagepipeline.platform.PreverificationHelper;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public abstract class c implements f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Class f2300f = c.class;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final byte[] f2301g = {-1, -39};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f2302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f2303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f2304c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final PreverificationHelper f2305d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final p064q.e f2306e;

    private static final class a implements p005b0.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final a f2307a = new a();

        private a() {
        }

        @Override // p005b0.h
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(Bitmap bitmap) {
        }
    }

    public c(i iVar, p064q.e eVar, h hVar) {
        this.f2305d = Build.VERSION.SDK_INT >= 26 ? new PreverificationHelper() : null;
        this.f2302a = iVar;
        if (iVar instanceof r) {
            this.f2303b = hVar.a();
            this.f2304c = hVar.b();
        }
        this.f2306e = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x0075  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c7 A[Catch: all -> 0x00a3, RuntimeException -> 0x00a6, IllegalArgumentException -> 0x00a8, TRY_LEAVE, TryCatch #8 {IllegalArgumentException -> 0x00a8, RuntimeException -> 0x00a6, blocks: (B:36:0x007d, B:39:0x0087, B:49:0x009f, B:68:0x00c7, B:64:0x00c0, B:65:0x00c3, B:62:0x00ba), top: B:98:0x007d, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private p005b0.a c(InputStream inputStream, BitmapFactory.Options options, Rect rect, ColorSpace colorSpace) {
        Bitmap bitmap;
        Bitmap bitmap2;
        ByteBuffer byteBufferAllocate;
        Bitmap bitmapDecodeStream;
        BitmapRegionDecoder bitmapRegionDecoderNewInstance;
        PreverificationHelper preverificationHelper;
        k.g(inputStream);
        int i3 = options.outWidth;
        int iHeight = options.outHeight;
        ?? r3 = i3;
        if (rect != null) {
            int iWidth = rect.width() / options.inSampleSize;
            iHeight = rect.height() / options.inSampleSize;
            r3 = iWidth;
        }
        int i4 = Build.VERSION.SDK_INT;
        boolean z3 = i4 >= 26 && (preverificationHelper = this.f2305d) != null && preverificationHelper.shouldUseHardwareBitmapConfig(options.inPreferredConfig);
        BitmapRegionDecoder bitmapRegionDecoder = 0;
        try {
            try {
                if (rect != null || !z3) {
                    if (rect != null && z3) {
                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                    }
                    if (!this.f2303b) {
                        bitmap = (Bitmap) this.f2302a.get(d(r3, iHeight, options));
                        if (bitmap == null) {
                            bitmap2 = bitmap;
                            throw new NullPointerException("BitmapPool.get returned null");
                        }
                    }
                    bitmap2 = bitmap;
                    options.inBitmap = bitmap2;
                    if (i4 >= 26) {
                        if (colorSpace == null) {
                            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
                        }
                        options.inPreferredColorSpace = colorSpace;
                    }
                    byteBufferAllocate = (ByteBuffer) this.f2306e.b();
                    if (byteBufferAllocate == null) {
                        byteBufferAllocate = ByteBuffer.allocate(p001a0.b.e());
                    }
                    options.inTempStorage = byteBufferAllocate.array();
                    if (rect != null || bitmap2 == 0) {
                        bitmapDecodeStream = null;
                    } else {
                        Bitmap.Config config = options.inPreferredConfig;
                        try {
                            if (config != null) {
                                try {
                                    bitmap2.reconfigure(r3, iHeight, config);
                                    bitmapRegionDecoderNewInstance = BitmapRegionDecoder.newInstance(inputStream, true);
                                    if (bitmapRegionDecoderNewInstance != null) {
                                        try {
                                            bitmapDecodeStream = bitmapRegionDecoderNewInstance.decodeRegion(rect, options);
                                        } catch (IOException unused) {
                                            Y.a.k(f2300f, "Could not decode region %s, decoding full bitmap instead.", rect);
                                            if (bitmapRegionDecoderNewInstance != null) {
                                                bitmapRegionDecoderNewInstance.recycle();
                                            }
                                            bitmapDecodeStream = null;
                                        }
                                    } else {
                                        bitmapDecodeStream = null;
                                    }
                                    if (bitmapRegionDecoderNewInstance != null) {
                                        bitmapRegionDecoderNewInstance.recycle();
                                    }
                                } catch (IOException unused2) {
                                    bitmapRegionDecoderNewInstance = null;
                                } catch (Throwable th) {
                                    th = th;
                                    if (bitmapRegionDecoder != 0) {
                                        bitmapRegionDecoder.recycle();
                                    }
                                    throw th;
                                }
                            } else {
                                bitmapDecodeStream = null;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            bitmapRegionDecoder = r3;
                        }
                    }
                    if (bitmapDecodeStream == null) {
                        bitmapDecodeStream = BitmapFactory.decodeStream(inputStream, null, options);
                    }
                    this.f2306e.a(byteBufferAllocate);
                    if (bitmap2 != 0 || bitmap2 == bitmapDecodeStream) {
                        return this.f2304c ? p005b0.a.n0(bitmapDecodeStream, a.f2307a) : p005b0.a.n0(bitmapDecodeStream, this.f2302a);
                    }
                    this.f2302a.a(bitmap2);
                    if (bitmapDecodeStream != null) {
                        bitmapDecodeStream.recycle();
                    }
                    throw new IllegalStateException();
                }
                options.inMutable = false;
                options.inTempStorage = byteBufferAllocate.array();
                if (rect != null) {
                    bitmapDecodeStream = null;
                } else {
                    bitmapDecodeStream = null;
                }
                if (bitmapDecodeStream == null) {
                    bitmapDecodeStream = BitmapFactory.decodeStream(inputStream, null, options);
                }
                this.f2306e.a(byteBufferAllocate);
                if (bitmap2 != 0) {
                }
                if (this.f2304c) {
                }
            } catch (IllegalArgumentException e4) {
                if (bitmap2 != 0) {
                    this.f2302a.a(bitmap2);
                }
                try {
                    inputStream.reset();
                    Bitmap bitmapDecodeStream2 = BitmapFactory.decodeStream(inputStream);
                    if (bitmapDecodeStream2 == null) {
                        throw e4;
                    }
                    p005b0.a aVarN0 = p005b0.a.n0(bitmapDecodeStream2, G0.d.b());
                    this.f2306e.a(byteBufferAllocate);
                    return aVarN0;
                } catch (IOException unused3) {
                    throw e4;
                }
            } catch (RuntimeException e5) {
                if (bitmap2 != 0) {
                    this.f2302a.a(bitmap2);
                }
                throw e5;
            }
        } catch (Throwable th3) {
            this.f2306e.a(byteBufferAllocate);
            throw th3;
        }
        bitmap2 = 0;
        bitmap2 = bitmap;
        options.inBitmap = bitmap2;
        if (i4 >= 26) {
            if (colorSpace == null) {
                colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            }
            options.inPreferredColorSpace = colorSpace;
        }
        byteBufferAllocate = (ByteBuffer) this.f2306e.b();
        if (byteBufferAllocate == null) {
            byteBufferAllocate = ByteBuffer.allocate(p001a0.b.e());
        }
    }

    private static BitmapFactory.Options e(j jVar, Bitmap.Config config, boolean z3) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = jVar.a0();
        options.inJustDecodeBounds = true;
        options.inDither = true;
        boolean z4 = Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE;
        if (!z4) {
            options.inPreferredConfig = config;
        }
        options.inMutable = true;
        if (!z3) {
            BitmapFactory.decodeStream(jVar.P(), null, options);
            if (options.outWidth == -1 || options.outHeight == -1) {
                throw new IllegalArgumentException();
            }
        }
        if (z4) {
            options.inPreferredConfig = config;
        }
        options.inJustDecodeBounds = false;
        return options;
    }

    @Override // S0.f
    public p005b0.a a(j jVar, Bitmap.Config config, Rect rect, int i3, ColorSpace colorSpace) {
        boolean zT0 = jVar.t0(i3);
        BitmapFactory.Options optionsE = e(jVar, config, this.f2303b);
        InputStream inputStreamP = jVar.P();
        k.g(inputStreamP);
        if (jVar.c0() > i3) {
            inputStreamP = new p013d0.a(inputStreamP, i3);
        }
        if (!zT0) {
            inputStreamP = new p013d0.b(inputStreamP, f2301g);
        }
        boolean z3 = optionsE.inPreferredConfig != Bitmap.Config.ARGB_8888;
        try {
            try {
                p005b0.a aVarC = c(inputStreamP, optionsE, rect, colorSpace);
                try {
                    inputStreamP.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
                return aVarC;
            } catch (RuntimeException e5) {
                if (!z3) {
                    throw e5;
                }
                p005b0.a aVarA = a(jVar, Bitmap.Config.ARGB_8888, rect, i3, colorSpace);
                try {
                    inputStreamP.close();
                } catch (IOException e6) {
                    e6.printStackTrace();
                }
                return aVarA;
            }
        } catch (Throwable th) {
            try {
                inputStreamP.close();
            } catch (IOException e7) {
                e7.printStackTrace();
            }
            throw th;
        }
    }

    @Override // S0.f
    public p005b0.a b(j jVar, Bitmap.Config config, Rect rect, ColorSpace colorSpace) {
        BitmapFactory.Options optionsE = e(jVar, config, this.f2303b);
        boolean z3 = optionsE.inPreferredConfig != Bitmap.Config.ARGB_8888;
        try {
            return c((InputStream) k.g(jVar.P()), optionsE, rect, colorSpace);
        } catch (RuntimeException e4) {
            if (z3) {
                return b(jVar, Bitmap.Config.ARGB_8888, rect, colorSpace);
            }
            throw e4;
        }
    }

    public abstract int d(int i3, int i4, BitmapFactory.Options options);
}
