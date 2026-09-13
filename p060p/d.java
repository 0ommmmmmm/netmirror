package p060p;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Comparator f10244a = new Comparator() { // from class: p.c
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return d.g((byte[]) obj, (byte[]) obj2);
        }
    };

    private interface a {
        static a a(Context context, Uri uri) {
            return new b(context, uri);
        }

        Cursor b(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal);

        void close();
    }

    private static class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentProviderClient f10245a;

        b(Context context, Uri uri) {
            this.f10245a = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }

        @Override // p.d.a
        public Cursor b(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            ContentProviderClient contentProviderClient = this.f10245a;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            } catch (RemoteException e4) {
                Log.w("FontsProvider", "Unable to query the content provider", e4);
                return null;
            }
        }

        @Override // p.d.a
        public void close() {
            ContentProviderClient contentProviderClient = this.f10245a;
            if (contentProviderClient != null) {
                contentProviderClient.close();
            }
        }
    }

    private static List b(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    private static boolean c(List list, List list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (!Arrays.equals((byte[]) list.get(i3), (byte[]) list2.get(i3))) {
                return false;
            }
        }
        return true;
    }

    private static List d(e eVar, Resources resources) {
        return eVar.b() != null ? eVar.b() : androidx.core.content.res.d.c(resources, eVar.c());
    }

    static g.a e(Context context, e eVar, CancellationSignal cancellationSignal) throws PackageManager.NameNotFoundException {
        ProviderInfo providerInfoF = f(context.getPackageManager(), eVar, context.getResources());
        return providerInfoF == null ? g.a.a(1, null) : g.a.a(0, h(context, eVar, providerInfoF.authority, cancellationSignal));
    }

    static ProviderInfo f(PackageManager packageManager, e eVar, Resources resources) throws PackageManager.NameNotFoundException {
        String strE = eVar.e();
        ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(strE, 0);
        if (providerInfoResolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + strE);
        }
        if (!providerInfoResolveContentProvider.packageName.equals(eVar.f())) {
            throw new PackageManager.NameNotFoundException("Found content provider " + strE + ", but package was not " + eVar.f());
        }
        List listB = b(packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures);
        Collections.sort(listB, f10244a);
        List listD = d(eVar, resources);
        for (int i3 = 0; i3 < listD.size(); i3++) {
            ArrayList arrayList = new ArrayList((Collection) listD.get(i3));
            Collections.sort(arrayList, f10244a);
            if (c(listB, arrayList)) {
                return providerInfoResolveContentProvider;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int g(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i3 = 0; i3 < bArr.length; i3++) {
            byte b4 = bArr[i3];
            byte b5 = bArr2[i3];
            if (b4 != b5) {
                return b4 - b5;
            }
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00d1  */
    static g.b[] h(Context context, e eVar, String str, CancellationSignal cancellationSignal) {
        boolean z3;
        ArrayList arrayList = new ArrayList();
        Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
        Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
        a aVarA = a.a(context, uriBuild);
        Cursor cursorB = null;
        try {
            cursorB = aVarA.b(uriBuild, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{eVar.g()}, null, cancellationSignal);
            if (cursorB != null && cursorB.getCount() > 0) {
                int columnIndex = cursorB.getColumnIndex("result_code");
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = cursorB.getColumnIndex("_id");
                int columnIndex3 = cursorB.getColumnIndex("file_id");
                int columnIndex4 = cursorB.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursorB.getColumnIndex("font_weight");
                int columnIndex6 = cursorB.getColumnIndex("font_italic");
                while (cursorB.moveToNext()) {
                    int i3 = columnIndex != -1 ? cursorB.getInt(columnIndex) : 0;
                    int i4 = columnIndex4 != -1 ? cursorB.getInt(columnIndex4) : 0;
                    Uri uriWithAppendedId = columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorB.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorB.getLong(columnIndex3));
                    int i5 = columnIndex5 != -1 ? cursorB.getInt(columnIndex5) : 400;
                    if (columnIndex6 != -1) {
                        z3 = true;
                        if (cursorB.getInt(columnIndex6) != 1) {
                            z3 = false;
                        }
                    } else {
                        z3 = false;
                    }
                    g.b bVarA = g.b.a(uriWithAppendedId, i4, i5, z3, i3);
                    arrayList2 = arrayList2;
                    arrayList2.add(bVarA);
                }
                arrayList = arrayList2;
            }
            return (g.b[]) arrayList.toArray(new g.b[0]);
        } finally {
            if (cursorB != null) {
                cursorB.close();
            }
            aVarA.close();
        }
    }
}
