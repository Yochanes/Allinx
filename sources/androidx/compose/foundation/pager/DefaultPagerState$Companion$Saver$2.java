package androidx.compose.foundation.pager;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0001\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, m18302d2 = {"<anonymous>", "Landroidx/compose/foundation/pager/DefaultPagerState;", "it", "", "", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class DefaultPagerState$Companion$Saver$2 extends Lambda implements Function1<List, DefaultPagerState> {

    /* JADX INFO: renamed from: a */
    public static final DefaultPagerState$Companion$Saver$2 f7665a = new DefaultPagerState$Companion$Saver$2(1);

    /* JADX INFO: renamed from: androidx.compose.foundation.pager.DefaultPagerState$Companion$Saver$2$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m18302d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    final class C06421 extends Lambda implements Function0<Integer> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f7666a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C06421(List list) {
            super(0);
            this.f7666a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Object obj = this.f7666a.get(2);
            Intrinsics.m18597e(obj, "null cannot be cast to non-null type kotlin.Int");
            return (Integer) obj;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List list = (List) obj;
        Object obj2 = list.get(0);
        Intrinsics.m18597e(obj2, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) obj2).intValue();
        Object obj3 = list.get(1);
        Intrinsics.m18597e(obj3, "null cannot be cast to non-null type kotlin.Float");
        return new DefaultPagerState(iIntValue, ((Float) obj3).floatValue(), new C06421(list));
    }
}
