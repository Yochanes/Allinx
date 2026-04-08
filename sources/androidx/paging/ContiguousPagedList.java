package androidx.paging;

import androidx.annotation.RestrictTo;
import androidx.paging.LegacyPageFetcher;
import androidx.paging.PagedStorage;
import androidx.paging.PagingSource;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u00042\u00020\u00052\b\u0012\u0004\u0012\u00028\u00010\u0006:\u0001\u0007¨\u0006\b"}, m18302d2 = {"Landroidx/paging/ContiguousPagedList;", "", "K", "V", "Landroidx/paging/PagedList;", "Landroidx/paging/PagedStorage$Callback;", "Landroidx/paging/LegacyPageFetcher$PageConsumer;", "Companion", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@RestrictTo
@SourceDebugExtension
public class ContiguousPagedList<K, V> extends PagedList<V> implements PagedStorage.Callback, LegacyPageFetcher.PageConsumer<V> {

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ int f30609t = 0;

    /* JADX INFO: renamed from: f */
    public final PagingSource f30610f;

    /* JADX INFO: renamed from: g */
    public final Object f30611g;

    /* JADX INFO: renamed from: i */
    public int f30612i;

    /* JADX INFO: renamed from: j */
    public int f30613j;

    /* JADX INFO: renamed from: n */
    public boolean f30614n;

    /* JADX INFO: renamed from: o */
    public boolean f30615o;

    /* JADX INFO: renamed from: p */
    public int f30616p;

    /* JADX INFO: renamed from: q */
    public int f30617q;

    /* JADX INFO: renamed from: r */
    public final boolean f30618r;

    /* JADX INFO: renamed from: s */
    public final LegacyPageFetcher f30619s;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/paging/ContiguousPagedList$Companion;", "", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContiguousPagedList(PagingSource pagingSource, PagingSource.LoadResult.Page initialPage, Object obj) {
        super(pagingSource, new PagedStorage());
        Intrinsics.m18599g(null, "coroutineScope");
        Intrinsics.m18599g(null, "notifyDispatcher");
        Intrinsics.m18599g(null, "backgroundDispatcher");
        Intrinsics.m18599g(null, "config");
        Intrinsics.m18599g(initialPage, "initialPage");
        this.f30610f = pagingSource;
        this.f30611g = obj;
        this.f30616p = Integer.MAX_VALUE;
        this.f30617q = Integer.MIN_VALUE;
        this.f30618r = true;
        PagedStorage pagedStorage = this.f31061a;
        Intrinsics.m18597e(pagedStorage, "null cannot be cast to non-null type androidx.paging.LegacyPageFetcher.KeyProvider<K of androidx.paging.ContiguousPagedList>");
        this.f30619s = new LegacyPageFetcher(pagingSource, this, pagedStorage);
        PagedStorage pagedStorage2 = this.f31061a;
        int i = initialPage.f31192d;
        i = i == Integer.MIN_VALUE ? 0 : i;
        pagedStorage2.getClass();
        pagedStorage2.f31075b = 0;
        ArrayList arrayList = pagedStorage2.f31074a;
        arrayList.clear();
        arrayList.add(initialPage);
        pagedStorage2.f31076c = 0;
        pagedStorage2.f31077d = i;
        List list = initialPage.f31189a;
        pagedStorage2.f31079g = list.size();
        pagedStorage2.f31078f = false;
        pagedStorage2.f31080i = list.size() / 2;
        m11386c(0, pagedStorage2.getSize());
        int i2 = this.f31061a.f31075b;
    }

    /* JADX INFO: renamed from: d */
    public final void m11327d(LoadState loadState) {
        this.f30619s.f30723e.m11387b(LoadType.f30752a, loadState);
    }
}
