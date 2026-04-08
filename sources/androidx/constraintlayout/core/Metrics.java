package androidx.constraintlayout.core;

import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class Metrics {

    /* JADX INFO: renamed from: a */
    public long f21161a;

    /* JADX INFO: renamed from: b */
    public long f21162b;

    /* JADX INFO: renamed from: c */
    public long f21163c;

    /* JADX INFO: renamed from: d */
    public long f21164d;

    /* JADX INFO: renamed from: e */
    public long f21165e;

    /* JADX INFO: renamed from: f */
    public long f21166f;

    /* JADX INFO: renamed from: g */
    public long f21167g;

    /* JADX INFO: renamed from: h */
    public long f21168h;

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n*** Metrics ***\nmeasures: ");
        sb.append(this.f21161a);
        sb.append("\nmeasuresWrap: 0\nmeasuresWrapInfeasible: 0\ndetermineGroups: 0\ninfeasibleDetermineGroups: 0\ngraphOptimizer: ");
        sb.append(this.f21163c);
        sb.append("\nwidgets: ");
        sb.append(this.f21168h);
        sb.append("\ngraphSolved: ");
        sb.append(this.f21164d);
        sb.append("\nlinearSolved: ");
        return AbstractC0000a.m12i(this.f21165e, "\n", sb);
    }
}
