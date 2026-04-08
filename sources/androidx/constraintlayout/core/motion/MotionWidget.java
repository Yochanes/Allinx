package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.state.WidgetFrame;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class MotionWidget implements TypedValues {

    /* JADX INFO: renamed from: a */
    public WidgetFrame f21332a;

    /* JADX INFO: renamed from: b */
    public final Motion f21333b;

    /* JADX INFO: renamed from: c */
    public final PropertySet f21334c;

    /* JADX INFO: compiled from: Proguard */
    public static class Motion {

        /* JADX INFO: renamed from: a */
        public String f21335a;

        /* JADX INFO: renamed from: b */
        public String f21336b;

        /* JADX INFO: renamed from: c */
        public int f21337c;

        /* JADX INFO: renamed from: d */
        public float f21338d;
    }

    /* JADX INFO: compiled from: Proguard */
    public static class PropertySet {

        /* JADX INFO: renamed from: a */
        public int f21339a;
    }

    public MotionWidget(WidgetFrame widgetFrame) {
        new WidgetFrame();
        Motion motion = new Motion();
        motion.f21335a = null;
        motion.f21336b = null;
        motion.f21337c = -1;
        motion.f21338d = Float.NaN;
        this.f21333b = motion;
        PropertySet propertySet = new PropertySet();
        propertySet.f21339a = 4;
        this.f21334c = propertySet;
        this.f21332a = widgetFrame;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    /* JADX INFO: renamed from: a */
    public final boolean mo6857a(int i, int i2) {
        if (m6879e(i2, i)) {
            return true;
        }
        Motion motion = this.f21333b;
        switch (i) {
            case 606:
                motion.getClass();
                return true;
            case 607:
                motion.f21337c = i2;
                return true;
            case 608:
                motion.getClass();
                return true;
            case 609:
                motion.getClass();
                return true;
            case 610:
                motion.getClass();
                return true;
            case 611:
                motion.getClass();
                return true;
            case 612:
                motion.getClass();
                return true;
            default:
                return false;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    /* JADX INFO: renamed from: b */
    public final boolean mo6858b(int i, String str) {
        Motion motion = this.f21333b;
        if (i == 605) {
            motion.f21335a = str;
            return true;
        }
        if (i == 603) {
            motion.f21336b = str;
        } else {
            if (i != 604) {
                return false;
            }
            motion.getClass();
        }
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    /* JADX INFO: renamed from: c */
    public final boolean mo6859c(int i, boolean z2) {
        return false;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    /* JADX INFO: renamed from: d */
    public final boolean mo6860d(float f, int i) {
        if (m6879e(f, i)) {
            return true;
        }
        Motion motion = this.f21333b;
        switch (i) {
            case 600:
                motion.getClass();
                return true;
            case 601:
                motion.f21338d = f;
                return true;
            case 602:
                motion.getClass();
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m6879e(float f, int i) {
        switch (i) {
            case 303:
                this.f21332a.f21748p = f;
                return true;
            case 304:
                this.f21332a.f21743k = f;
                return true;
            case 305:
                this.f21332a.f21744l = f;
                return true;
            case 306:
                this.f21332a.f21745m = f;
                return true;
            case 307:
            default:
                return false;
            case 308:
                this.f21332a.f21740h = f;
                return true;
            case 309:
                this.f21332a.f21741i = f;
                return true;
            case 310:
                this.f21332a.f21742j = f;
                return true;
            case 311:
                this.f21332a.f21746n = f;
                return true;
            case 312:
                this.f21332a.f21747o = f;
                return true;
            case 313:
                this.f21332a.f21738f = f;
                return true;
            case 314:
                this.f21332a.f21739g = f;
                return true;
            case 315:
            case 316:
                return true;
        }
    }

    public final String toString() {
        return this.f21332a.f21734b + ", " + this.f21332a.f21735c + ", " + this.f21332a.f21736d + ", " + this.f21332a.f21737e;
    }
}
