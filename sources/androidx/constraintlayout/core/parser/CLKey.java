package androidx.constraintlayout.core.parser;

import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class CLKey extends CLContainer {
    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add("ConstraintSets");
        arrayList.add("Variables");
        arrayList.add("Generate");
        arrayList.add("Transitions");
        arrayList.add("KeyFrames");
        arrayList.add("KeyAttributes");
        arrayList.add("KeyPositions");
        arrayList.add("KeyCycles");
    }

    /* JADX INFO: renamed from: E */
    public final CLElement m6961E() {
        if (this.f21527f.size() > 0) {
            return (CLElement) this.f21527f.get(0);
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.parser.CLContainer, androidx.constraintlayout.core.parser.CLElement
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CLKey) || Objects.equals(m6956c(), ((CLKey) obj).m6956c())) {
            return super.equals(obj);
        }
        return false;
    }
}
