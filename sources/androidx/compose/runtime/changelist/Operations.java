package androidx.compose.runtime.changelist;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.SlotWriter;
import androidx.compose.runtime.internal.RememberEventDispatcher;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.king.logx.logger.Logger;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.ArraysKt___ArraysKt$asIterable$$inlined$Iterable$4;
import kotlin.collections.ArraysKt___ArraysKt$asIterable$$inlined$Iterable$5;
import kotlin.collections.ArraysKt___ArraysKt$asIterable$$inlined$Iterable$6;
import kotlin.collections.ArraysKt___ArraysKt$asIterable$$inlined$Iterable$7;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/compose/runtime/changelist/Operations;", "Landroidx/compose/runtime/changelist/OperationsDebugStringFormattable;", "OpIterator", "WriteScope", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class Operations extends OperationsDebugStringFormattable {

    /* JADX INFO: renamed from: b */
    public int f16721b;

    /* JADX INFO: renamed from: d */
    public int f16723d;

    /* JADX INFO: renamed from: f */
    public int f16725f;

    /* JADX INFO: renamed from: a */
    public Operation[] f16720a = new Operation[16];

    /* JADX INFO: renamed from: c */
    public int[] f16722c = new int[16];

    /* JADX INFO: renamed from: e */
    public Object[] f16724e = new Object[16];

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/runtime/changelist/Operations$OpIterator;", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public final class OpIterator implements OperationArgContainer {

        /* JADX INFO: renamed from: a */
        public int f16726a;

        /* JADX INFO: renamed from: b */
        public int f16727b;

        /* JADX INFO: renamed from: c */
        public int f16728c;

        public OpIterator() {
        }

        /* JADX INFO: renamed from: a */
        public final int m4557a(int i) {
            return Operations.this.f16722c[this.f16727b + i];
        }

        /* JADX INFO: renamed from: b */
        public final Object m4558b(int i) {
            return Operations.this.f16724e[this.f16728c + i];
        }

        /* JADX INFO: renamed from: c */
        public final boolean m4559c() {
            int i = this.f16726a;
            Operations operations = Operations.this;
            int i2 = operations.f16721b;
            if (i >= i2) {
                return false;
            }
            Operation operation = operations.f16720a[i];
            this.f16727b += operation.f16683a;
            this.f16728c += operation.f16684b;
            int i3 = i + 1;
            this.f16726a = i3;
            return i3 < i2;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/compose/runtime/changelist/Operations$WriteScope;", "", "stack", "Landroidx/compose/runtime/changelist/Operations;", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    @JvmInline
    @SourceDebugExtension
    public static final class WriteScope {
        /* JADX INFO: renamed from: a */
        public static final void m4560a(Operations operations, int i, Object obj) {
            operations.f16724e[(operations.f16725f - operations.f16720a[operations.f16721b - 1].f16684b) + i] = obj;
        }

        /* JADX INFO: renamed from: b */
        public static final void m4561b(Operations operations, int i, Object obj, int i2, Object obj2) {
            int i3 = operations.f16725f - operations.f16720a[operations.f16721b - 1].f16684b;
            Object[] objArr = operations.f16724e;
            objArr[i + i3] = obj;
            objArr[i3 + i2] = obj2;
        }

        /* JADX INFO: renamed from: c */
        public static final void m4562c(Operations operations, Object obj, Object obj2, Object obj3) {
            int i = operations.f16725f - operations.f16720a[operations.f16721b - 1].f16684b;
            Object[] objArr = operations.f16724e;
            objArr[i] = obj;
            objArr[i + 1] = obj2;
            objArr[i + 2] = obj3;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof WriteScope)) {
                return false;
            }
            ((WriteScope) obj).getClass();
            return Intrinsics.m18594b(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "WriteScope(stack=null)";
        }
    }

    @Override // androidx.compose.runtime.changelist.OperationsDebugStringFormattable
    /* JADX INFO: renamed from: a */
    public final String mo4537a(String str) {
        String string;
        StringBuilder sb = new StringBuilder();
        if (m4554f()) {
            OpIterator opIterator = new OpIterator();
            int i = 0;
            while (true) {
                sb.append(str);
                int i2 = i + 1;
                sb.append(i);
                sb.append(". ");
                Operation operation = Operations.this.f16720a[opIterator.f16726a];
                int i3 = operation.f16683a;
                string = "";
                int i4 = operation.f16684b;
                if (i3 == 0 && i4 == 0) {
                    String strMo18588i = Reflection.f51660a.mo18612b(operation.getClass()).mo18588i();
                    if (strMo18588i != null) {
                        string = strMo18588i;
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    String strMo18588i2 = Reflection.f51660a.mo18612b(operation.getClass()).mo18588i();
                    sb2.append(strMo18588i2 != null ? strMo18588i2 : "");
                    sb2.append('(');
                    String str2 = str + Logger.INDENT;
                    boolean z2 = true;
                    for (int i5 = 0; i5 < operation.f16683a; i5++) {
                        String strMo4547b = operation.mo4547b(i5);
                        if (z2) {
                            z2 = false;
                        } else {
                            sb2.append(", ");
                        }
                        sb2.append('\n');
                        sb2.append(str2);
                        sb2.append(strMo4547b);
                        sb2.append(" = ");
                        sb2.append(opIterator.m4557a(i5));
                    }
                    for (int i6 = 0; i6 < i4; i6++) {
                        String strMo4548c = operation.mo4548c(i6);
                        if (z2) {
                            z2 = false;
                        } else {
                            sb2.append(", ");
                        }
                        sb2.append('\n');
                        sb2.append(str2);
                        sb2.append(strMo4548c);
                        sb2.append(" = ");
                        sb2.append(m4552d(opIterator.m4558b(i6), str2));
                    }
                    sb2.append('\n');
                    sb2.append(str);
                    sb2.append(")");
                    string = sb2.toString();
                    Intrinsics.m18598f(string, "toString(...)");
                }
                sb.append(string);
                sb.append('\n');
                if (!opIterator.m4559c()) {
                    break;
                }
                i = i2;
            }
        }
        String string2 = sb.toString();
        Intrinsics.m18598f(string2, "toString(...)");
        return string2;
    }

    /* JADX INFO: renamed from: b */
    public final void m4550b() {
        this.f16721b = 0;
        this.f16723d = 0;
        Arrays.fill(this.f16724e, 0, this.f16725f, (Object) null);
        this.f16725f = 0;
    }

    /* JADX INFO: renamed from: c */
    public final void m4551c(Applier applier, SlotWriter slotWriter, RememberEventDispatcher rememberEventDispatcher) {
        if (m4554f()) {
            OpIterator opIterator = new OpIterator();
            do {
                Operations.this.f16720a[opIterator.f16726a].mo4546a(opIterator, applier, slotWriter, rememberEventDispatcher);
            } while (opIterator.m4559c());
        }
        m4550b();
    }

    /* JADX INFO: renamed from: d */
    public final String m4552d(Object obj, String str) {
        if (obj == null) {
            return "null";
        }
        if (obj instanceof Object[]) {
            return m4556h(ArraysKt.m18363d((Object[]) obj), str);
        }
        boolean z2 = obj instanceof int[];
        Iterable arraysKt___ArraysKt$asIterable$$inlined$Iterable$7 = EmptyList.f51496a;
        if (z2) {
            int[] iArr = (int[]) obj;
            if (iArr.length != 0) {
                arraysKt___ArraysKt$asIterable$$inlined$Iterable$7 = new ArraysKt___ArraysKt$asIterable$$inlined$Iterable$4(iArr);
            }
            return m4556h(arraysKt___ArraysKt$asIterable$$inlined$Iterable$7, str);
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            if (jArr.length != 0) {
                arraysKt___ArraysKt$asIterable$$inlined$Iterable$7 = new ArraysKt___ArraysKt$asIterable$$inlined$Iterable$5(jArr);
            }
            return m4556h(arraysKt___ArraysKt$asIterable$$inlined$Iterable$7, str);
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            if (fArr.length != 0) {
                arraysKt___ArraysKt$asIterable$$inlined$Iterable$7 = new ArraysKt___ArraysKt$asIterable$$inlined$Iterable$6(fArr);
            }
            return m4556h(arraysKt___ArraysKt$asIterable$$inlined$Iterable$7, str);
        }
        if (!(obj instanceof double[])) {
            return obj instanceof Iterable ? m4556h((Iterable) obj, str) : obj instanceof OperationsDebugStringFormattable ? ((OperationsDebugStringFormattable) obj).mo4537a(str) : obj.toString();
        }
        double[] dArr = (double[]) obj;
        if (dArr.length != 0) {
            arraysKt___ArraysKt$asIterable$$inlined$Iterable$7 = new ArraysKt___ArraysKt$asIterable$$inlined$Iterable$7(dArr);
        }
        return m4556h(arraysKt___ArraysKt$asIterable$$inlined$Iterable$7, str);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m4553e() {
        return this.f16721b == 0;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m4554f() {
        return this.f16721b != 0;
    }

    /* JADX INFO: renamed from: g */
    public final void m4555g(Operation operation) {
        int i = this.f16721b;
        Operation[] operationArr = this.f16720a;
        int length = operationArr.length;
        int i2 = UserMetadata.MAX_ATTRIBUTE_SIZE;
        if (i == length) {
            Operation[] operationArr2 = new Operation[(i > 1024 ? 1024 : i) + i];
            System.arraycopy(operationArr, 0, operationArr2, 0, i);
            this.f16720a = operationArr2;
        }
        int i3 = this.f16723d + operation.f16683a;
        int[] iArr = this.f16722c;
        int length2 = iArr.length;
        if (i3 > length2) {
            int i4 = (length2 > 1024 ? 1024 : length2) + length2;
            if (i4 >= i3) {
                i3 = i4;
            }
            int[] iArr2 = new int[i3];
            ArraysKt.m18379n(0, 0, iArr, iArr2, length2);
            this.f16722c = iArr2;
        }
        int i5 = this.f16725f;
        int i6 = operation.f16684b;
        int i7 = i5 + i6;
        Object[] objArr = this.f16724e;
        int length3 = objArr.length;
        if (i7 > length3) {
            if (length3 <= 1024) {
                i2 = length3;
            }
            int i8 = i2 + length3;
            if (i8 >= i7) {
                i7 = i8;
            }
            Object[] objArr2 = new Object[i7];
            System.arraycopy(objArr, 0, objArr2, 0, length3);
            this.f16724e = objArr2;
        }
        Operation[] operationArr3 = this.f16720a;
        int i9 = this.f16721b;
        this.f16721b = i9 + 1;
        operationArr3[i9] = operation;
        this.f16723d += operation.f16683a;
        this.f16725f += i6;
    }

    /* JADX INFO: renamed from: h */
    public final String m4556h(Iterable iterable, String str) {
        return CollectionsKt.m18409J(iterable, ", ", "[", "]", new Operations$toCollectionString$1(this, str), 24);
    }
}
