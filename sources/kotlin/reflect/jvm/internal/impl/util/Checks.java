package kotlin.reflect.jvm.internal.impl.util;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.text.Regex;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class Checks {

    /* JADX INFO: renamed from: a */
    public final Name f55027a;

    /* JADX INFO: renamed from: b */
    public final Regex f55028b;

    /* JADX INFO: renamed from: c */
    public final Collection f55029c;

    /* JADX INFO: renamed from: d */
    public final Function1 f55030d;

    /* JADX INFO: renamed from: e */
    public final Check[] f55031e;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.util.Checks$2 */
    /* JADX INFO: compiled from: Proguard */
    final class C62262 extends Lambda implements Function1 {

        /* JADX INFO: renamed from: a */
        public static final C62262 f55032a = new C62262(1);

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Intrinsics.m18599g((FunctionDescriptor) obj, "$this$null");
            return null;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.util.Checks$3 */
    /* JADX INFO: compiled from: Proguard */
    final class C62273 extends Lambda implements Function1 {

        /* JADX INFO: renamed from: a */
        public static final C62273 f55033a = new C62273(1);

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Intrinsics.m18599g((FunctionDescriptor) obj, "$this$null");
            return null;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.util.Checks$4 */
    /* JADX INFO: compiled from: Proguard */
    final class C62284 extends Lambda implements Function1 {

        /* JADX INFO: renamed from: a */
        public static final C62284 f55034a = new C62284(1);

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Intrinsics.m18599g((FunctionDescriptor) obj, "$this$null");
            return null;
        }
    }

    public Checks(Name name, Regex regex, Collection collection, Function1 function1, Check... checkArr) {
        this.f55027a = name;
        this.f55028b = regex;
        this.f55029c = collection;
        this.f55030d = function1;
        this.f55031e = checkArr;
    }

    public /* synthetic */ Checks(Name name, Check[] checkArr) {
        this(name, checkArr, C62262.f55032a);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Checks(Name name, Check[] checkArr, Function1 function1) {
        this(name, null, null, function1, (Check[]) Arrays.copyOf(checkArr, checkArr.length));
        Intrinsics.m18599g(name, "name");
    }

    public /* synthetic */ Checks(Set set, Check[] checkArr) {
        this(set, checkArr, C62284.f55034a);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Checks(Collection nameList, Check[] checkArr, Function1 function1) {
        this(null, null, nameList, function1, (Check[]) Arrays.copyOf(checkArr, checkArr.length));
        Intrinsics.m18599g(nameList, "nameList");
    }
}
