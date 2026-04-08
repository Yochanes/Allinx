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
@DebugMetadata(m18558c = "androidx.paging.PageEvent$StaticList", m18559f = "PageEvent.kt", m18560l = {66}, m18561m = "filter")
final class PageEvent$StaticList$filter$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public PageEvent.StaticList f30833a;

    /* JADX INFO: renamed from: b */
    public Function2 f30834b;

    /* JADX INFO: renamed from: c */
    public Collection f30835c;

    /* JADX INFO: renamed from: d */
    public Iterator f30836d;

    /* JADX INFO: renamed from: f */
    public Object f30837f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f30838g;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ PageEvent.StaticList f30839i;

    /* JADX INFO: renamed from: j */
    public int f30840j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageEvent$StaticList$filter$1(PageEvent.StaticList staticList, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f30839i = staticList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f30838g = obj;
        this.f30840j |= Integer.MIN_VALUE;
        return this.f30839i.mo11352a(null, this);
    }
}
