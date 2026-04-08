package androidx.constraintlayout.widget;

import androidx.constraintlayout.core.Metrics;
import java.util.ArrayList;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayoutStatistics {

    /* JADX INFO: renamed from: a */
    public final Metrics f22718a;

    static {
        new String(new char[25]).replace((char) 0, ' ');
    }

    public ConstraintLayoutStatistics(ConstraintLayoutStatistics constraintLayoutStatistics) {
        Metrics metrics = new Metrics();
        new ArrayList();
        this.f22718a = metrics;
        Metrics metrics2 = constraintLayoutStatistics.f22718a;
        metrics2.getClass();
        metrics.f21161a = metrics2.f21161a;
        metrics.f21168h = metrics2.f21168h;
        metrics.f21162b = metrics2.f21162b;
        metrics.f21166f = metrics2.f21166f;
        metrics.f21167g = metrics2.f21167g;
        metrics.f21163c = metrics2.f21163c;
        metrics.f21164d = metrics2.f21164d;
    }

    public final Object clone() {
        return new ConstraintLayoutStatistics(this);
    }
}
