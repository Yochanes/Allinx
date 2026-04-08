package androidx.work.impl.model;

import android.annotation.SuppressLint;
import androidx.room.Dao;
import androidx.work.Data;
import androidx.work.WorkInfo;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Dao
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, m18302d2 = {"Landroidx/work/impl/model/WorkSpecDao;", "", "work-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@SuppressLint({"UnknownNullness"})
public interface WorkSpecDao {
    /* JADX INFO: renamed from: A */
    int mo12233A(String str);

    /* JADX INFO: renamed from: B */
    int mo12234B();

    /* JADX INFO: renamed from: C */
    int mo12235C();

    /* JADX INFO: renamed from: a */
    ArrayList mo12236a();

    /* JADX INFO: renamed from: b */
    void mo12237b(String str);

    /* JADX INFO: renamed from: c */
    ArrayList mo12238c();

    /* JADX INFO: renamed from: d */
    ArrayList mo12239d();

    /* JADX INFO: renamed from: e */
    void mo12240e(String str);

    /* JADX INFO: renamed from: f */
    int mo12241f(long j, String str);

    /* JADX INFO: renamed from: g */
    Flow mo12242g();

    /* JADX INFO: renamed from: h */
    ArrayList mo12243h(long j);

    /* JADX INFO: renamed from: i */
    ArrayList mo12244i(int i);

    /* JADX INFO: renamed from: j */
    ArrayList mo12245j();

    /* JADX INFO: renamed from: k */
    int mo12246k(WorkInfo.State state, String str);

    /* JADX INFO: renamed from: l */
    void mo12247l(WorkSpec workSpec);

    /* JADX INFO: renamed from: m */
    void mo12248m(long j, String str);

    /* JADX INFO: renamed from: n */
    void mo12249n(int i, String str);

    /* JADX INFO: renamed from: o */
    ArrayList mo12250o();

    /* JADX INFO: renamed from: p */
    void mo12251p(String str, Data data);

    /* JADX INFO: renamed from: q */
    ArrayList mo12252q();

    /* JADX INFO: renamed from: r */
    void mo12253r(int i, String str);

    /* JADX INFO: renamed from: s */
    ArrayList mo12254s();

    /* JADX INFO: renamed from: t */
    ArrayList mo12255t();

    /* JADX INFO: renamed from: u */
    WorkInfo.State mo12256u(String str);

    /* JADX INFO: renamed from: v */
    WorkSpec mo12257v(String str);

    /* JADX INFO: renamed from: w */
    int mo12258w(String str);

    /* JADX INFO: renamed from: x */
    ArrayList mo12259x();

    /* JADX INFO: renamed from: y */
    int mo12260y(String str);

    /* JADX INFO: renamed from: z */
    ArrayList mo12261z(String str);
}
