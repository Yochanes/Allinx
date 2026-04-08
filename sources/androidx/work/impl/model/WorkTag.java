package androidx.work.impl.model;

import androidx.annotation.RestrictTo;
import androidx.room.Entity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Entity
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/work/impl/model/WorkTag;", "", "work-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@RestrictTo
public final class WorkTag {

    /* JADX INFO: renamed from: a */
    public final String f33057a;

    /* JADX INFO: renamed from: b */
    public final String f33058b;

    public WorkTag(String tag, String workSpecId) {
        Intrinsics.m18599g(tag, "tag");
        Intrinsics.m18599g(workSpecId, "workSpecId");
        this.f33057a = tag;
        this.f33058b = workSpecId;
    }
}
