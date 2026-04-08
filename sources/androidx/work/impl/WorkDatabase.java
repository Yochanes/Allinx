package androidx.work.impl;

import androidx.annotation.RestrictTo;
import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.PreferenceDao;
import androidx.work.impl.model.RawWorkInfoDao;
import androidx.work.impl.model.SystemIdInfoDao;
import androidx.work.impl.model.WorkNameDao;
import androidx.work.impl.model.WorkProgressDao;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkTagDao;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@TypeConverters
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m18302d2 = {"Landroidx/work/impl/WorkDatabase;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "Companion", "work-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@Database
@RestrictTo
public abstract class WorkDatabase extends RoomDatabase {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/work/impl/WorkDatabase$Companion;", "", "work-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: renamed from: q */
    public abstract DependencyDao mo12135q();

    /* JADX INFO: renamed from: r */
    public abstract PreferenceDao mo12136r();

    /* JADX INFO: renamed from: s */
    public abstract RawWorkInfoDao mo12137s();

    /* JADX INFO: renamed from: t */
    public abstract SystemIdInfoDao mo12138t();

    /* JADX INFO: renamed from: u */
    public abstract WorkNameDao mo12139u();

    /* JADX INFO: renamed from: v */
    public abstract WorkProgressDao mo12140v();

    /* JADX INFO: renamed from: w */
    public abstract WorkSpecDao mo12141w();

    /* JADX INFO: renamed from: x */
    public abstract WorkTagDao mo12142x();
}
