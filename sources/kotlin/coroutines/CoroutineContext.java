package kotlin.coroutines;

import androidx.navigation.compose.C2024h;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SinceKotlin
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m18302d2 = {"Lkotlin/coroutines/CoroutineContext;", "", "Key", "Element", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public interface CoroutineContext {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class DefaultImpls {
        /* JADX INFO: renamed from: a */
        public static CoroutineContext m18550a(CoroutineContext coroutineContext, CoroutineContext context) {
            Intrinsics.m18599g(context, "context");
            return context == EmptyCoroutineContext.f51581a ? coroutineContext : (CoroutineContext) context.mo2461L0(coroutineContext, new C2024h(21));
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlin/coroutines/CoroutineContext$Element;", "Lkotlin/coroutines/CoroutineContext;", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public interface Element extends CoroutineContext {

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
        public static final class DefaultImpls {
            /* JADX INFO: renamed from: a */
            public static Element m18551a(Element element, Key key) {
                Intrinsics.m18599g(key, "key");
                if (Intrinsics.m18594b(element.getF51575a(), key)) {
                    return element;
                }
                return null;
            }

            /* JADX INFO: renamed from: b */
            public static CoroutineContext m18552b(Element element, Key key) {
                Intrinsics.m18599g(key, "key");
                return Intrinsics.m18594b(element.getF51575a(), key) ? EmptyCoroutineContext.f51581a : element;
            }

            /* JADX INFO: renamed from: c */
            public static CoroutineContext m18553c(Element element, CoroutineContext context) {
                Intrinsics.m18599g(context, "context");
                return DefaultImpls.m18550a(element, context);
            }
        }

        /* JADX INFO: renamed from: getKey */
        Key getF51575a();
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003¨\u0006\u0004"}, m18302d2 = {"Lkotlin/coroutines/CoroutineContext$Key;", "E", "Lkotlin/coroutines/CoroutineContext$Element;", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public interface Key<E extends Element> {
    }

    /* JADX INFO: renamed from: L0 */
    Object mo2461L0(Object obj, Function2 function2);

    /* JADX INFO: renamed from: b0 */
    CoroutineContext mo2463b0(Key key);

    /* JADX INFO: renamed from: u */
    Element mo2464u(Key key);

    /* JADX INFO: renamed from: z */
    CoroutineContext mo2465z(CoroutineContext coroutineContext);
}
