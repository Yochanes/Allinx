package androidx.paging;

import androidx.paging.PageEvent;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
@DebugMetadata(m18558c = "androidx.paging.PageEvent$StaticList", m18559f = "PageEvent.kt", m18560l = {48}, m18561m = "map")
final class PageEvent$StaticList$map$1<R> extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public PageEvent.StaticList f30848a;

    /* JADX INFO: renamed from: b */
    public Function2 f30849b;

    /* JADX INFO: renamed from: c */
    public Collection f30850c;

    /* JADX INFO: renamed from: d */
    public Iterator f30851d;

    /* JADX INFO: renamed from: f */
    public Collection f30852f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f30853g;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ PageEvent.StaticList f30854i;

    /* JADX INFO: renamed from: j */
    public int f30855j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageEvent$StaticList$map$1(PageEvent.StaticList staticList, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f30854i = staticList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f30853g = obj;
        this.f30855j |= Integer.MIN_VALUE;
        return this.f30854i.mo11353b(null, this);
    }
}
