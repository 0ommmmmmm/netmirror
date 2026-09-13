package p021f0;

/* JADX INFO: loaded from: classes.dex */
public class a extends Exception {
    public a(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        return this;
    }
}
