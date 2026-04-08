package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension
final class Jsr305Settings$description$2 extends Lambda implements Function0<String[]> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Jsr305Settings f52757a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Jsr305Settings$description$2(Jsr305Settings jsr305Settings) {
        super(0);
        this.f52757a = jsr305Settings;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ListBuilder listBuilderM18460v = CollectionsKt.m18460v();
        Jsr305Settings jsr305Settings = this.f52757a;
        listBuilderM18460v.add(jsr305Settings.f52752a.f52804a);
        ReportLevel reportLevel = jsr305Settings.f52753b;
        if (reportLevel != null) {
            listBuilderM18460v.add("under-migration:".concat(reportLevel.f52804a));
        }
        for (Map.Entry entry : jsr305Settings.f52754c.entrySet()) {
            listBuilderM18460v.add("@" + entry.getKey() + ':' + ((ReportLevel) entry.getValue()).f52804a);
        }
        return (String[]) CollectionsKt.m18450q(listBuilderM18460v).toArray(new String[0]);
    }
}
