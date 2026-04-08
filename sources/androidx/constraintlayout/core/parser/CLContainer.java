package androidx.constraintlayout.core.parser;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class CLContainer extends CLElement {

    /* JADX INFO: renamed from: f */
    public ArrayList f21527f;

    public CLContainer(char[] cArr) {
        super(cArr);
        this.f21527f = new ArrayList();
    }

    /* JADX INFO: renamed from: A */
    public final String m6938A(String str) {
        CLElement cLElementM6953v = m6953v(str);
        if (cLElementM6953v instanceof CLString) {
            return cLElementM6953v.m6956c();
        }
        return null;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m6939B(String str) {
        for (CLElement cLElement : this.f21527f) {
            if ((cLElement instanceof CLKey) && ((CLKey) cLElement).m6956c().equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: C */
    public final ArrayList m6940C() {
        ArrayList arrayList = new ArrayList();
        for (CLElement cLElement : this.f21527f) {
            if (cLElement instanceof CLKey) {
                arrayList.add(((CLKey) cLElement).m6956c());
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: D */
    public final void m6941D(String str, CLElement cLElement) {
        Iterator it = this.f21527f.iterator();
        while (it.hasNext()) {
            CLKey cLKey = (CLKey) ((CLElement) it.next());
            if (cLKey.m6956c().equals(str)) {
                if (cLKey.f21527f.size() > 0) {
                    cLKey.f21527f.set(0, cLElement);
                    return;
                } else {
                    cLKey.f21527f.add(cLElement);
                    return;
                }
            }
        }
        CLKey cLKey2 = new CLKey(str.toCharArray());
        cLKey2.f21529b = 0L;
        cLKey2.m6960i(str.length() - 1);
        if (cLKey2.f21527f.size() > 0) {
            cLKey2.f21527f.set(0, cLElement);
        } else {
            cLKey2.f21527f.add(cLElement);
        }
        this.f21527f.add(cLKey2);
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ CLElement mo6942a() {
        return mo6944k();
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public /* bridge */ /* synthetic */ Object clone() {
        return mo6944k();
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CLContainer) {
            return this.f21527f.equals(((CLContainer) obj).f21527f);
        }
        return false;
    }

    public final float getFloat(int i) throws CLParsingException {
        CLElement cLElementM6945l = m6945l(i);
        if (cLElementM6945l != null) {
            return cLElementM6945l.mo6957d();
        }
        throw new CLParsingException(AbstractC0000a.m9f(i, "no float at index "), this);
    }

    public final int getInt(int i) throws CLParsingException {
        CLElement cLElementM6945l = m6945l(i);
        if (cLElementM6945l != null) {
            return cLElementM6945l.mo6958e();
        }
        throw new CLParsingException(AbstractC0000a.m9f(i, "no int at index "), this);
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public int hashCode() {
        return Objects.hash(this.f21527f, Integer.valueOf(super.hashCode()));
    }

    /* JADX INFO: renamed from: j */
    public final void m6943j(CLElement cLElement) {
        this.f21527f.add(cLElement);
    }

    /* JADX INFO: renamed from: k */
    public CLContainer mo6944k() {
        CLContainer cLContainer = (CLContainer) super.mo6942a();
        ArrayList arrayList = new ArrayList(this.f21527f.size());
        Iterator it = this.f21527f.iterator();
        while (it.hasNext()) {
            CLElement cLElementMo6942a = ((CLElement) it.next()).mo6942a();
            cLElementMo6942a.f21531d = cLContainer;
            arrayList.add(cLElementMo6942a);
        }
        cLContainer.f21527f = arrayList;
        return cLContainer;
    }

    /* JADX INFO: renamed from: l */
    public final CLElement m6945l(int i) throws CLParsingException {
        if (i < 0 || i >= this.f21527f.size()) {
            throw new CLParsingException(AbstractC0000a.m9f(i, "no element at index "), this);
        }
        return (CLElement) this.f21527f.get(i);
    }

    /* JADX INFO: renamed from: m */
    public final CLElement m6946m(String str) throws CLParsingException {
        Iterator it = this.f21527f.iterator();
        while (it.hasNext()) {
            CLKey cLKey = (CLKey) ((CLElement) it.next());
            if (cLKey.m6956c().equals(str)) {
                return cLKey.m6961E();
            }
        }
        throw new CLParsingException(AbstractC0000a.m3D("no element for key <", str, ">"), this);
    }

    /* JADX INFO: renamed from: o */
    public final CLArray m6947o(String str) throws CLParsingException {
        CLElement cLElementM6946m = m6946m(str);
        if (cLElementM6946m instanceof CLArray) {
            return (CLArray) cLElementM6946m;
        }
        StringBuilder sbM23t = AbstractC0000a.m23t("no array found for key <", str, ">, found [");
        sbM23t.append(cLElementM6946m.m6959f());
        sbM23t.append("] : ");
        sbM23t.append(cLElementM6946m);
        throw new CLParsingException(sbM23t.toString(), this);
    }

    /* JADX INFO: renamed from: p */
    public final CLArray m6948p(String str) {
        CLElement cLElementM6953v = m6953v(str);
        if (cLElementM6953v instanceof CLArray) {
            return (CLArray) cLElementM6953v;
        }
        return null;
    }

    /* JADX INFO: renamed from: q */
    public final float m6949q(String str) throws CLParsingException {
        CLElement cLElementM6946m = m6946m(str);
        if (cLElementM6946m != null) {
            return cLElementM6946m.mo6957d();
        }
        StringBuilder sbM23t = AbstractC0000a.m23t("no float found for key <", str, ">, found [");
        sbM23t.append(cLElementM6946m.m6959f());
        sbM23t.append("] : ");
        sbM23t.append(cLElementM6946m);
        throw new CLParsingException(sbM23t.toString(), this);
    }

    /* JADX INFO: renamed from: r */
    public final float m6950r(String str) {
        CLElement cLElementM6953v = m6953v(str);
        if (cLElementM6953v instanceof CLNumber) {
            return cLElementM6953v.mo6957d();
        }
        return Float.NaN;
    }

    /* JADX INFO: renamed from: s */
    public final CLObject m6951s(String str) {
        CLElement cLElementM6953v = m6953v(str);
        if (cLElementM6953v instanceof CLObject) {
            return (CLObject) cLElementM6953v;
        }
        return null;
    }

    /* JADX INFO: renamed from: t */
    public final CLElement m6952t(int i) {
        if (i < 0 || i >= this.f21527f.size()) {
            return null;
        }
        return (CLElement) this.f21527f.get(i);
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (CLElement cLElement : this.f21527f) {
            if (sb.length() > 0) {
                sb.append("; ");
            }
            sb.append(cLElement);
        }
        return super.toString() + " = <" + ((Object) sb) + " >";
    }

    /* JADX INFO: renamed from: v */
    public final CLElement m6953v(String str) {
        Iterator it = this.f21527f.iterator();
        while (it.hasNext()) {
            CLKey cLKey = (CLKey) ((CLElement) it.next());
            if (cLKey.m6956c().equals(str)) {
                return cLKey.m6961E();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: w */
    public final String m6954w(int i) throws CLParsingException {
        CLElement cLElementM6945l = m6945l(i);
        if (cLElementM6945l instanceof CLString) {
            return cLElementM6945l.m6956c();
        }
        throw new CLParsingException(AbstractC0000a.m9f(i, "no string at index "), this);
    }

    /* JADX INFO: renamed from: y */
    public final String m6955y(String str) throws CLParsingException {
        CLElement cLElementM6946m = m6946m(str);
        if (cLElementM6946m instanceof CLString) {
            return cLElementM6946m.m6956c();
        }
        StringBuilder sbM25v = AbstractC0000a.m25v("no string found for key <", str, ">, found [", cLElementM6946m != null ? cLElementM6946m.m6959f() : null, "] : ");
        sbM25v.append(cLElementM6946m);
        throw new CLParsingException(sbM25v.toString(), this);
    }
}
