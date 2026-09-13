package bin.mt.signature;

import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Environment;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.lsposed.hiddenapibypass.HiddenApiBypass;

/* JADX INFO: loaded from: classes2.dex */
public class KillerApplication extends Application {
    public static final String URL = "https://github.com/L-JINBIN/ApkSignatureKillerEx";

    static {
        killPM("app.netmirror.netmirrornew", "MIIDezCCAmOgAwIBAgIEIy6uYjANBgkqhkiG9w0BAQUFADBtMQswCQYDVQQGEwJVUzEQMA4GA1UE\nCBMHVW5rbm93bjEQMA4GA1UEBxMHVW5rbm93bjEQMA4GA1UEChMHVW5rbm93bjEQMA4GA1UECxMH\nQW5kcm9pZDEWMBQGA1UEAxMNQW5kcm9pZCBEZWJ1ZzAgFw0xMzEyMzEyMjM1MDRaGA8yMDUyMDQz\nMDIyMzUwNFowbTELMAkGA1UEBhMCVVMxEDAOBgNVBAgTB1Vua25vd24xEDAOBgNVBAcTB1Vua25v\nd24xEDAOBgNVBAoTB1Vua25vd24xEDAOBgNVBAsTB0FuZHJvaWQxFjAUBgNVBAMTDUFuZHJvaWQg\nRGVidWcwggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQCS3m4gJshs1UQeeIwl9A1b3NF3\nutd6Z8MCfc/orRY/1RVepFNrWL4ZmTaexxZncIGFCB01zey5cSTE7MrNduGWQobgjAWKrS/n+DTa\n0ViEB1pb9Ug3h1dr9ViH/Jgz+z0hnSk28VC5gbk5661P59m1YeIIVxHTiEVJLNS6mqtBX7IbgqR1\n2AVzaYf7Fz7Ay1fx4uZA2Y8t4d7pJwAVsOhjOF3b+7abh9xVAUqKKjVZGdF9FWMFtuax5+4CSnGM\niQcIkmJAf9RD3kfv8tpI13R5KyDfkyGAQ9+ZXc1CN2mAxiv9LSPDT7i+LnCtloYleAoO6KlFSXLU\nTbEl8Ibf6dFhAgMBAAGjITAfMB0GA1UdDgQWBBQL+f44idKKnFjwwQq3DkMo2CPzIDANBgkqhkiG\n9w0BAQUFAAOCAQEAX9J2Fb/OYxhNElDBuRF18Lzi+cROeud3f42FyeGyFT09EAZrsAGaLAptfjwC\n29/3dta2/ycuvPRoJZhopAwOd9QwRV57z8O5/y9PeoqTG3WwUrv0JF8x4o4PSRAYq36X1/uOHXPT\nEs0I3Jb7ndOTnKLh1q32XP9KWNnskWrqBtQ7UkP61ZzxFG48catm0yTwEpNaMU6Wr/gbrsGDyDeQ\n+ZqG2rVrW8WybRaUvDVeQpDsAu26EV1Xu91lqLDkaTRWtawqOgekRH5detTenfyKmcU81O5sLmW5\nv97Gia6OIxnWTLg6YwiiGH4wwD/u9odxjUkD5UADqaC1f3jb2aiJKg==\n");
        killOpen("app.netmirror.netmirrornew");
    }

    private static Field findField(Class<?> cls, String str) throws NoSuchFieldException {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (NoSuchFieldException e4) {
            while (true) {
                cls = cls.getSuperclass();
                if (cls == null || cls.equals(Object.class)) {
                    break;
                }
                try {
                    Field declaredField2 = cls.getDeclaredField(str);
                    declaredField2.setAccessible(true);
                    return declaredField2;
                } catch (NoSuchFieldException unused) {
                }
            }
            throw e4;
        }
    }

    private static String getApkPath(String str) {
        String str2;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/self/maps"));
            do {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        bufferedReader.close();
                        return null;
                    }
                    String[] strArrSplit = line.split("\\s+");
                    str2 = strArrSplit[strArrSplit.length - 1];
                } catch (Throwable th) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
                throw new RuntimeException(e);
            } while (!isApkPath(str, str2));
            bufferedReader.close();
            return str2;
        } catch (Exception e4) {
            throw new RuntimeException(e4);
        }
    }

    private static File getDataFile(String str) {
        String name = Environment.getExternalStorageDirectory().getName();
        if (name.matches("\\d+")) {
            File file = new File("/data/user/" + name + "/" + str);
            if (file.canWrite()) {
                return file;
            }
        }
        return new File("/data/data/" + str);
    }

    private static native void hookApkPath(String str, String str2);

    private static boolean isApkPath(String str, String str2) {
        if (str2.startsWith("/") && str2.endsWith(".apk")) {
            String[] strArrSplit = str2.substring(1).split("/", 6);
            int length = strArrSplit.length;
            if (length == 4 || length == 5) {
                if (strArrSplit[0].equals("data") && strArrSplit[1].equals("app") && strArrSplit[length - 1].equals("base.apk")) {
                    return strArrSplit[length - 2].startsWith(str);
                }
                if (strArrSplit[0].equals("mnt") && strArrSplit[1].equals("asec") && strArrSplit[length - 1].equals("pkg.apk")) {
                    return strArrSplit[length - 2].startsWith(str);
                }
            } else if (length == 3) {
                if (strArrSplit[0].equals("data") && strArrSplit[1].equals("app")) {
                    return strArrSplit[2].startsWith(str);
                }
            } else if (length == 6 && strArrSplit[0].equals("mnt") && strArrSplit[1].equals("expand") && strArrSplit[3].equals("app") && strArrSplit[5].equals("base.apk")) {
                return strArrSplit[4].endsWith(str);
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x009a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private static void killOpen(String str) {
        try {
            System.loadLibrary("SignatureKiller");
            String apkPath = getApkPath(str);
            if (apkPath == null) {
                System.err.println("Get apk path failed");
                return;
            }
            File file = new File(apkPath);
            File file2 = new File(getDataFile(str), "origin.apk");
            try {
                ZipFile zipFile = new ZipFile(file);
                try {
                    ZipEntry entry = zipFile.getEntry("assets/SignatureKiller/origin.apk");
                    if (entry == null) {
                        System.err.println("Entry not found: assets/SignatureKiller/origin.apk");
                        zipFile.close();
                        return;
                    }
                    if (!file2.exists() || file2.length() != entry.getSize()) {
                        InputStream inputStream = zipFile.getInputStream(entry);
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(file2);
                            try {
                                byte[] bArr = new byte[102400];
                                while (true) {
                                    int i3 = inputStream.read(bArr);
                                    if (i3 == -1) {
                                        break;
                                    } else {
                                        fileOutputStream.write(bArr, 0, i3);
                                    }
                                    if (inputStream != null) {
                                        try {
                                            inputStream.close();
                                        } catch (Throwable th) {
                                            th.addSuppressed(th);
                                        }
                                    }
                                    throw th;
                                }
                                fileOutputStream.close();
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                            } catch (Throwable th2) {
                                try {
                                    fileOutputStream.close();
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                }
                                throw th2;
                            }
                        } catch (Throwable th4) {
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            throw th4;
                        }
                    }
                    zipFile.close();
                    hookApkPath(file.getAbsolutePath(), file2.getAbsolutePath());
                    return;
                } catch (Throwable th5) {
                    try {
                        zipFile.close();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                    throw th5;
                }
            } catch (IOException e4) {
                throw new RuntimeException(e4);
            }
            throw new RuntimeException(e4);
        } catch (Throwable unused) {
            System.err.println("Load SignatureKiller library failed");
        }
    }

    private static void killPM(final String str, String str2) {
        final Signature signature = new Signature(Base64.decode(str2, 0));
        final Parcelable.Creator creator = PackageInfo.CREATOR;
        try {
            findField(PackageInfo.class, "CREATOR").set(null, new Parcelable.Creator<PackageInfo>() { // from class: bin.mt.signature.KillerApplication.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public PackageInfo createFromParcel(Parcel parcel) {
                    Signature[] apkContentsSigners;
                    PackageInfo packageInfo = (PackageInfo) creator.createFromParcel(parcel);
                    if (packageInfo.packageName.equals(str)) {
                        if (packageInfo.signatures != null && packageInfo.signatures.length > 0) {
                            packageInfo.signatures[0] = signature;
                        }
                        if (Build.VERSION.SDK_INT >= 28 && packageInfo.signingInfo != null && (apkContentsSigners = packageInfo.signingInfo.getApkContentsSigners()) != null && apkContentsSigners.length > 0) {
                            apkContentsSigners[0] = signature;
                        }
                    }
                    return packageInfo;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public PackageInfo[] newArray(int i3) {
                    return (PackageInfo[]) creator.newArray(i3);
                }
            });
            if (Build.VERSION.SDK_INT >= 28) {
                HiddenApiBypass.addHiddenApiExemptions("Landroid/os/Parcel;", "Landroid/content/pm", "Landroid/app");
            }
            try {
                Object obj = findField(PackageManager.class, "sPackageInfoCache").get(null);
                obj.getClass().getMethod("clear", new Class[0]).invoke(obj, new Object[0]);
            } catch (Throwable unused) {
            }
            try {
                ((Map) findField(Parcel.class, "mCreators").get(null)).clear();
            } catch (Throwable unused2) {
            }
            try {
                ((Map) findField(Parcel.class, "sPairedCreators").get(null)).clear();
            } catch (Throwable unused3) {
            }
        } catch (Exception e4) {
            throw new RuntimeException(e4);
        }
    }
}
