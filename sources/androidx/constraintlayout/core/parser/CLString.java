package androidx.constraintlayout.core.parser;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class CLString extends CLElement {
    /* JADX INFO: renamed from: j */
    public static CLString m6963j(String str) {
        CLString cLString = new CLString(str.toCharArray());
        cLString.f21529b = 0L;
        cLString.m6960i(str.length() - 1);
        return cLString;
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof CLString) && m6956c().equals(((CLString) obj).m6956c())) {
            return true;
        }
        return super.equals(obj);
    }
}
