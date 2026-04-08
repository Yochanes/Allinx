package kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u0000*\f\b\u0000\u0010\u0002 \u0001*\u0004\u0018\u00010\u00012\u00020\u0003J\u001b\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m18302d2 = {"Lkotlin/reflect/jvm/internal/calls/Caller;", "Ljava/lang/reflect/Member;", "M", "", "", "args", "", "checkArguments", "([Ljava/lang/Object;)V", "kotlin-reflection"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public interface Caller<M extends Member> {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class DefaultImpls {
        /* JADX INFO: renamed from: a */
        public static void m18750a(Caller caller, Object[] args) {
            Intrinsics.m18599g(args, "args");
            if (CallerKt.m18754a(caller) == args.length) {
                return;
            }
            StringBuilder sb = new StringBuilder("Callable expects ");
            sb.append(CallerKt.m18754a(caller));
            sb.append(" arguments, but ");
            throw new IllegalArgumentException(AbstractC0000a.m11h(args.length, " were provided.", sb));
        }
    }

    /* JADX INFO: renamed from: a */
    List mo18747a();

    /* JADX INFO: renamed from: b */
    Member mo18748b();

    Object call(Object[] objArr);

    Type getReturnType();
}
