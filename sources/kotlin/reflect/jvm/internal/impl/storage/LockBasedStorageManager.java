package kotlin.reflect.jvm.internal.impl.storage;

import androidx.datastore.preferences.protobuf.AbstractC1610a;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.utils.ExceptionUtilsKt;
import kotlin.reflect.jvm.internal.impl.utils.WrappedValues;
import kotlin.text.StringsKt;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class LockBasedStorageManager implements StorageManager {

    /* JADX INFO: renamed from: d */
    public static final String f54748d;

    /* JADX INFO: renamed from: e */
    public static final StorageManager f54749e;

    /* JADX INFO: renamed from: a */
    public final SimpleLock f54750a;

    /* JADX INFO: renamed from: b */
    public final ExceptionHandlingStrategy f54751b;

    /* JADX INFO: renamed from: c */
    public final String f54752c;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$1 */
    /* JADX INFO: compiled from: Proguard */
    public static class C62061 extends LockBasedStorageManager {
        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager
        /* JADX INFO: renamed from: j */
        public final RecursionDetectedResult mo20085j(Object obj, String str) {
            return new RecursionDetectedResult(null, true);
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$4 */
    /* JADX INFO: compiled from: Proguard */
    class C62074 extends LockBasedNotNullLazyValue<Object> {
        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedLazyValue
        /* JADX INFO: renamed from: c */
        public final RecursionDetectedResult mo20086c(boolean z2) {
            return new RecursionDetectedResult(EmptyList.f51496a, false);
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$5 */
    /* JADX INFO: compiled from: Proguard */
    class C62085 extends LockBasedNotNullLazyValueWithPostCompute<Object> {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ Function1 f54753f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ Function1 f54754g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C62085(LockBasedStorageManager lockBasedStorageManager, Function0 function0, Function1 function1, Function1 function12) {
            super(lockBasedStorageManager, function0);
            this.f54753f = function1;
            this.f54754g = function12;
            if (lockBasedStorageManager == null) {
                LockBasedNotNullLazyValueWithPostCompute.m20092a(0);
                throw null;
            }
            this.f54761d = null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedLazyValue
        /* JADX INFO: renamed from: c */
        public final RecursionDetectedResult mo20086c(boolean z2) {
            return new RecursionDetectedResult(this.f54753f.invoke(Boolean.valueOf(z2)), false);
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedLazyValueWithPostCompute
        /* JADX INFO: renamed from: e */
        public final void mo20087e(Object obj) {
            if (obj == null) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "value", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5", "doPostCompute"));
            }
            this.f54754g.invoke(obj);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class CacheWithNotNullValuesBasedOnMemoizedFunction<K, V> extends CacheWithNullableValuesBasedOnMemoizedFunction<K, V> implements CacheWithNotNullValues<K, V> {
        @Override // kotlin.reflect.jvm.internal.impl.storage.CacheWithNotNullValues
        /* JADX INFO: renamed from: a */
        public final Object mo20074a(Object obj, Function0 function0) throws Throwable {
            Object objInvoke = invoke(new KeyWithComputation((FqName) obj, function0));
            if (objInvoke != null) {
                return objInvoke;
            }
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction", "computeIfAbsent"));
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class CacheWithNullableValuesBasedOnMemoizedFunction<K, V> extends MapBasedMemoizedFunction<KeyWithComputation<K, V>, V> implements CacheWithNullableValues<K, V> {

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$CacheWithNullableValuesBasedOnMemoizedFunction$1 */
        /* JADX INFO: compiled from: Proguard */
        class C62091 implements Function1<KeyWithComputation<Object, Object>, Object> {
            /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ((KeyWithComputation) obj).f54757b.invoke();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CacheWithNullableValuesBasedOnMemoizedFunction(LockBasedStorageManager lockBasedStorageManager, ConcurrentHashMap concurrentHashMap) {
            super(lockBasedStorageManager, concurrentHashMap, new C62091());
            if (lockBasedStorageManager == null) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "storageManager", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNullableValuesBasedOnMemoizedFunction", "<init>"));
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface ExceptionHandlingStrategy {

        /* JADX INFO: renamed from: a */
        public static final ExceptionHandlingStrategy f54755a = new C62101();

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$ExceptionHandlingStrategy$1 */
        /* JADX INFO: compiled from: Proguard */
        public static class C62101 implements ExceptionHandlingStrategy {
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class KeyWithComputation<K, V> {

        /* JADX INFO: renamed from: a */
        public final FqName f54756a;

        /* JADX INFO: renamed from: b */
        public final Lambda f54757b;

        /* JADX WARN: Multi-variable type inference failed */
        public KeyWithComputation(FqName fqName, Function0 function0) {
            this.f54756a = fqName;
            this.f54757b = (Lambda) function0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.f54756a.equals(((KeyWithComputation) obj).f54756a);
        }

        public final int hashCode() {
            return this.f54756a.hashCode();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class LockBasedLazyValueWithPostCompute<T> extends LockBasedLazyValue<T> {

        /* JADX INFO: renamed from: d */
        public volatile SingleThreadValue f54761d;

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedLazyValue
        /* JADX INFO: renamed from: b */
        public final void mo20089b(Object obj) {
            this.f54761d = new SingleThreadValue(obj);
            try {
                mo20087e(obj);
            } finally {
                this.f54761d = null;
            }
        }

        /* JADX INFO: renamed from: e */
        public abstract void mo20087e(Object obj);

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedLazyValue, kotlin.jvm.functions.Function0
        public Object invoke() {
            SingleThreadValue singleThreadValue = this.f54761d;
            if (singleThreadValue == null || singleThreadValue.f54772b != Thread.currentThread()) {
                return super.invoke();
            }
            if (singleThreadValue.f54772b == Thread.currentThread()) {
                return singleThreadValue.f54771a;
            }
            throw new IllegalStateException("No value in this thread (hasValue should be checked before)");
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class LockBasedNotNullLazyValue<T> extends LockBasedLazyValue<T> implements NotNullLazyValue<T> {
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m20091a(int i) {
            String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i != 2 ? 3 : 2];
            if (i == 1) {
                objArr[0] = "computable";
            } else if (i != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            }
            if (i != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            } else {
                objArr[1] = "invoke";
            }
            if (i != 2) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i == 2) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedLazyValue, kotlin.jvm.functions.Function0
        public final Object invoke() throws Throwable {
            Object objInvoke = super.invoke();
            if (objInvoke != null) {
                return objInvoke;
            }
            m20091a(2);
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class LockBasedNotNullLazyValueWithPostCompute<T> extends LockBasedLazyValueWithPostCompute<T> implements NotNullLazyValue<T> {
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m20092a(int i) {
            String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i != 2 ? 3 : 2];
            if (i == 1) {
                objArr[0] = "computable";
            } else if (i != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            }
            if (i != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            } else {
                objArr[1] = "invoke";
            }
            if (i != 2) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i == 2) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedLazyValueWithPostCompute, kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.LockBasedLazyValue, kotlin.jvm.functions.Function0
        public final Object invoke() {
            Object objInvoke = super.invoke();
            if (objInvoke != null) {
                return objInvoke;
            }
            m20092a(2);
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class MapBasedMemoizedFunction<K, V> implements MemoizedFunctionToNullable<K, V> {

        /* JADX INFO: renamed from: a */
        public final LockBasedStorageManager f54762a;

        /* JADX INFO: renamed from: b */
        public final ConcurrentHashMap f54763b;

        /* JADX INFO: renamed from: c */
        public final Function1 f54764c;

        public MapBasedMemoizedFunction(LockBasedStorageManager lockBasedStorageManager, ConcurrentHashMap concurrentHashMap, Function1 function1) {
            if (lockBasedStorageManager == null) {
                m20093b(0);
                throw null;
            }
            this.f54762a = lockBasedStorageManager;
            this.f54763b = concurrentHashMap;
            this.f54764c = function1;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m20093b(int i) {
            String str = (i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i == 3 || i == 4) ? 2 : 3];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i == 2) {
                objArr[0] = "compute";
            } else if (i == 3 || i == 4) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[0] = "storageManager";
            }
            if (i == 3) {
                objArr[1] = "recursionDetected";
            } else if (i != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[1] = "raceCondition";
            }
            if (i != 3 && i != 4) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i != 3 && i != 4) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        /* JADX INFO: renamed from: c */
        public final AssertionError m20094c(Object obj, Object obj2) {
            AssertionError assertionError = new AssertionError("Race condition detected on input " + obj + ". Old value is " + obj2 + " under " + this.f54762a);
            LockBasedStorageManager.m20075k(assertionError);
            return assertionError;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public Object invoke(Object obj) throws Throwable {
            ConcurrentHashMap concurrentHashMap = this.f54763b;
            Object obj2 = concurrentHashMap.get(obj);
            NotValue notValue = NotValue.f54766b;
            Object obj3 = WrappedValues.f55108a;
            AssertionError assertionErrorM20094c = null;
            if (obj2 != null && obj2 != notValue) {
                WrappedValues.m20352b(obj2);
                if (obj2 == obj3) {
                    return null;
                }
                return obj2;
            }
            LockBasedStorageManager lockBasedStorageManager = this.f54762a;
            SimpleLock simpleLock = lockBasedStorageManager.f54750a;
            SimpleLock simpleLock2 = lockBasedStorageManager.f54750a;
            simpleLock.lock();
            try {
                Object obj4 = concurrentHashMap.get(obj);
                NotValue notValue2 = NotValue.f54767c;
                if (obj4 == notValue) {
                    RecursionDetectedResult recursionDetectedResultMo20085j = lockBasedStorageManager.mo20085j(obj, "");
                    if (recursionDetectedResultMo20085j == null) {
                        m20093b(3);
                        throw null;
                    }
                    if (!recursionDetectedResultMo20085j.f54770b) {
                        Object obj5 = recursionDetectedResultMo20085j.f54769a;
                        simpleLock2.unlock();
                        return obj5;
                    }
                    obj4 = notValue2;
                }
                if (obj4 == notValue2) {
                    RecursionDetectedResult recursionDetectedResultMo20085j2 = lockBasedStorageManager.mo20085j(obj, "");
                    if (recursionDetectedResultMo20085j2 == null) {
                        m20093b(3);
                        throw null;
                    }
                    if (!recursionDetectedResultMo20085j2.f54770b) {
                        Object obj6 = recursionDetectedResultMo20085j2.f54769a;
                        simpleLock2.unlock();
                        return obj6;
                    }
                }
                if (obj4 != null) {
                    WrappedValues.m20352b(obj4);
                    Object obj7 = obj4 != obj3 ? obj4 : null;
                    simpleLock2.unlock();
                    return obj7;
                }
                try {
                    concurrentHashMap.put(obj, notValue);
                    Object objInvoke = this.f54764c.invoke(obj);
                    if (objInvoke != null) {
                        obj3 = objInvoke;
                    }
                    Object objPut = concurrentHashMap.put(obj, obj3);
                    if (objPut == notValue) {
                        simpleLock2.unlock();
                        return objInvoke;
                    }
                    assertionErrorM20094c = m20094c(obj, objPut);
                    throw assertionErrorM20094c;
                } catch (Throwable th) {
                    if (ExceptionUtilsKt.m20342a(th)) {
                        concurrentHashMap.remove(obj);
                        throw th;
                    }
                    ExceptionHandlingStrategy exceptionHandlingStrategy = lockBasedStorageManager.f54751b;
                    if (th == assertionErrorM20094c) {
                        ((ExceptionHandlingStrategy.C62101) exceptionHandlingStrategy).getClass();
                        throw th;
                    }
                    Object objPut2 = concurrentHashMap.put(obj, WrappedValues.m20351a(th));
                    if (objPut2 != notValue) {
                        throw m20094c(obj, objPut2);
                    }
                    ((ExceptionHandlingStrategy.C62101) exceptionHandlingStrategy).getClass();
                    throw th;
                }
            } catch (Throwable th2) {
                simpleLock2.unlock();
                throw th2;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable
        /* JADX INFO: renamed from: k */
        public final boolean mo20095k(FqName fqName) {
            Object obj = this.f54763b.get(fqName);
            return (obj == null || obj == NotValue.f54766b) ? false : true;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class MapBasedMemoizedFunctionToNotNull<K, V> extends MapBasedMemoizedFunction<K, V> implements MemoizedFunctionToNotNull<K, V> {
        @Override // kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.MapBasedMemoizedFunction, kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) throws Throwable {
            Object objInvoke = super.invoke(obj);
            if (objInvoke != null) {
                return objInvoke;
            }
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull", "invoke"));
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class NotValue {

        /* JADX INFO: renamed from: a */
        public static final NotValue f54765a;

        /* JADX INFO: renamed from: b */
        public static final NotValue f54766b;

        /* JADX INFO: renamed from: c */
        public static final NotValue f54767c;

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ NotValue[] f54768d;

        static {
            NotValue notValue = new NotValue("NOT_COMPUTED", 0);
            f54765a = notValue;
            NotValue notValue2 = new NotValue("COMPUTING", 1);
            f54766b = notValue2;
            NotValue notValue3 = new NotValue("RECURSION_WAS_DETECTED", 2);
            f54767c = notValue3;
            f54768d = new NotValue[]{notValue, notValue2, notValue3};
        }

        public static NotValue valueOf(String str) {
            return (NotValue) Enum.valueOf(NotValue.class, str);
        }

        public static NotValue[] values() {
            return (NotValue[]) f54768d.clone();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class RecursionDetectedResult<T> {

        /* JADX INFO: renamed from: a */
        public final Object f54769a;

        /* JADX INFO: renamed from: b */
        public final boolean f54770b;

        public RecursionDetectedResult(Object obj, boolean z2) {
            this.f54769a = obj;
            this.f54770b = z2;
        }

        public final String toString() {
            return this.f54770b ? "FALL_THROUGH" : String.valueOf(this.f54769a);
        }
    }

    static {
        String strSubstring;
        String canonicalName = LockBasedStorageManager.class.getCanonicalName();
        Intrinsics.m18599g(canonicalName, "<this>");
        int iM20450z = StringsKt.m20450z(0, 6, canonicalName, ".");
        if (iM20450z == -1) {
            strSubstring = "";
        } else {
            strSubstring = canonicalName.substring(0, iM20450z);
            Intrinsics.m18598f(strSubstring, "substring(...)");
        }
        f54748d = strSubstring;
        f54749e = new C62061("NO_LOCKS", EmptySimpleLock.f54747a);
    }

    public LockBasedStorageManager(String str) {
        this(str, new DefaultSimpleLock(new ReentrantLock()));
    }

    /* JADX INFO: renamed from: k */
    public static void m20075k(AssertionError assertionError) {
        StackTraceElement[] stackTrace = assertionError.getStackTrace();
        int length = stackTrace.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (!stackTrace[i].getClassName().startsWith(f54748d)) {
                break;
            } else {
                i++;
            }
        }
        List listSubList = Arrays.asList(stackTrace).subList(i, length);
        assertionError.setStackTrace((StackTraceElement[]) listSubList.toArray(new StackTraceElement[listSubList.size()]));
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    /* JADX INFO: renamed from: a */
    public final NotNullLazyValue mo20076a(Function0 function0) {
        return new LockBasedNotNullLazyValue(this, function0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    /* JADX INFO: renamed from: b */
    public final NullableLazyValue mo20077b(Function0 function0) {
        return new LockBasedLazyValue(this, function0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.StorageManager
    /* JADX INFO: renamed from: c */
    public final NotNullLazyValue mo20078c(Function0 function0, Function1 function1, Function1 function12) {
        return new C62085(this, function0, function1, function12);
    }

    /* JADX INFO: renamed from: d */
    public final Object m20079d(Function0 function0) {
        SimpleLock simpleLock = this.f54750a;
        simpleLock.lock();
        try {
            function0.invoke();
            simpleLock.unlock();
            return null;
        } finally {
        }
    }

    /* JADX INFO: renamed from: e */
    public final CacheWithNotNullValues m20080e() {
        return new CacheWithNotNullValuesBasedOnMemoizedFunction(this, new ConcurrentHashMap(3, 1.0f, 2));
    }

    /* JADX INFO: renamed from: f */
    public final CacheWithNullableValues m20081f() {
        return new CacheWithNullableValuesBasedOnMemoizedFunction(this, new ConcurrentHashMap(3, 1.0f, 2));
    }

    /* JADX INFO: renamed from: g */
    public final MemoizedFunctionToNotNull m20082g(Function1 function1) {
        return new MapBasedMemoizedFunctionToNotNull(this, new ConcurrentHashMap(3, 1.0f, 2), function1);
    }

    /* JADX INFO: renamed from: h */
    public final MemoizedFunctionToNullable m20083h(Function1 function1) {
        return new MapBasedMemoizedFunction(this, new ConcurrentHashMap(3, 1.0f, 2), function1);
    }

    /* JADX INFO: renamed from: i */
    public final NotNullLazyValue m20084i(Function0 function0) {
        return new C62074(this, function0);
    }

    /* JADX INFO: renamed from: j */
    public RecursionDetectedResult mo20085j(Object obj, String str) {
        StringBuilder sb = new StringBuilder("Recursion detected ");
        sb.append(str);
        sb.append(obj == null ? "" : AbstractC1610a.m8733k(obj, "on input: "));
        sb.append(" under ");
        sb.append(this);
        AssertionError assertionError = new AssertionError(sb.toString());
        m20075k(assertionError);
        throw assertionError;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(" (");
        return AbstractC0000a.m19p(sb, this.f54752c, ")");
    }

    public LockBasedStorageManager(String str, SimpleLock simpleLock) {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.f54755a;
        this.f54750a = simpleLock;
        this.f54751b = exceptionHandlingStrategy;
        this.f54752c = str;
    }

    /* JADX INFO: compiled from: Proguard */
    public static class LockBasedLazyValue<T> implements NullableLazyValue<T> {

        /* JADX INFO: renamed from: a */
        public final LockBasedStorageManager f54758a;

        /* JADX INFO: renamed from: b */
        public final Function0 f54759b;

        /* JADX INFO: renamed from: c */
        public volatile Object f54760c;

        public LockBasedLazyValue(LockBasedStorageManager lockBasedStorageManager, Function0 function0) {
            if (lockBasedStorageManager == null) {
                m20088a(0);
                throw null;
            }
            this.f54760c = NotValue.f54765a;
            this.f54758a = lockBasedStorageManager;
            this.f54759b = function0;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m20088a(int i) {
            String str = (i == 2 || i == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i == 2 || i == 3) ? 2 : 3];
            if (i == 1) {
                objArr[0] = "computable";
            } else if (i == 2 || i == 3) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[0] = "storageManager";
            }
            if (i == 2) {
                objArr[1] = "recursionDetected";
            } else if (i != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[1] = "renderDebugInformation";
            }
            if (i != 2 && i != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i != 2 && i != 3) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        /* JADX INFO: renamed from: c */
        public RecursionDetectedResult mo20086c(boolean z2) {
            RecursionDetectedResult recursionDetectedResultMo20085j = this.f54758a.mo20085j(null, "in a lazy value");
            if (recursionDetectedResultMo20085j != null) {
                return recursionDetectedResultMo20085j;
            }
            m20088a(2);
            throw null;
        }

        /* JADX INFO: renamed from: f */
        public final boolean m20090f() {
            return (this.f54760c == NotValue.f54765a || this.f54760c == NotValue.f54766b) ? false : true;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0046 A[Catch: all -> 0x0022, TRY_LEAVE, TryCatch #0 {all -> 0x0022, blocks: (B:7:0x0011, B:9:0x0017, B:16:0x002a, B:18:0x0035, B:20:0x003a, B:22:0x0043, B:23:0x0046, B:27:0x0055, B:29:0x005b, B:31:0x005f, B:32:0x0065, B:33:0x006e, B:34:0x006f, B:35:0x0075, B:24:0x0048), top: B:38:0x0011, inners: #1 }] */
        @Override // kotlin.jvm.functions.Function0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object invoke() throws Throwable {
            Object obj = this.f54760c;
            if (!(obj instanceof NotValue)) {
                WrappedValues.m20352b(obj);
                return obj;
            }
            this.f54758a.f54750a.lock();
            try {
                Object objInvoke = this.f54760c;
                if (objInvoke instanceof NotValue) {
                    NotValue notValue = NotValue.f54766b;
                    NotValue notValue2 = NotValue.f54767c;
                    if (objInvoke == notValue) {
                        this.f54760c = notValue2;
                        RecursionDetectedResult recursionDetectedResultMo20086c = mo20086c(true);
                        if (!recursionDetectedResultMo20086c.f54770b) {
                            objInvoke = recursionDetectedResultMo20086c.f54769a;
                        } else if (objInvoke == notValue2) {
                            RecursionDetectedResult recursionDetectedResultMo20086c2 = mo20086c(false);
                            if (recursionDetectedResultMo20086c2.f54770b) {
                                this.f54760c = notValue;
                                try {
                                    objInvoke = this.f54759b.invoke();
                                    mo20089b(objInvoke);
                                    this.f54760c = objInvoke;
                                } catch (Throwable th) {
                                    if (ExceptionUtilsKt.m20342a(th)) {
                                        this.f54760c = NotValue.f54765a;
                                        throw th;
                                    }
                                    if (this.f54760c == notValue) {
                                        this.f54760c = WrappedValues.m20351a(th);
                                    }
                                    ((ExceptionHandlingStrategy.C62101) this.f54758a.f54751b).getClass();
                                    throw th;
                                }
                            } else {
                                objInvoke = recursionDetectedResultMo20086c2.f54769a;
                            }
                        }
                    }
                } else {
                    WrappedValues.m20352b(objInvoke);
                }
                return objInvoke;
            } finally {
                this.f54758a.f54750a.unlock();
            }
        }

        /* JADX INFO: renamed from: b */
        public void mo20089b(Object obj) {
        }
    }
}
