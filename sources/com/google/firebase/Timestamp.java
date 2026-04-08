package com.google.firebase;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RequiresApi;
import androidx.compose.animation.AbstractC0455a;
import com.google.common.p027io.AbstractC4465b;
import io.intercom.android.sdk.models.AttributeType;
import java.time.Instant;
import java.util.Date;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18301d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\"B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u000f\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB\u000f\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0011\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0000H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0006H\u0016J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0013\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0006H\u0016J\u0006\u0010\u0019\u001a\u00020\tJ\b\u0010\u001a\u001a\u00020\fH\u0007J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0006H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006#"}, m18302d2 = {"Lcom/google/firebase/Timestamp;", "", "Landroid/os/Parcelable;", "seconds", "", "nanoseconds", "", "(JI)V", AttributeType.DATE, "Ljava/util/Date;", "(Ljava/util/Date;)V", "time", "Ljava/time/Instant;", "(Ljava/time/Instant;)V", "getNanoseconds", "()I", "getSeconds", "()J", "compareTo", "other", "describeContents", "equals", "", "", "hashCode", "toDate", "toInstant", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "com.google.firebase-firebase-common"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class Timestamp implements Comparable<Timestamp>, Parcelable {
    private final int nanoseconds;
    private final long seconds;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static final Parcelable.Creator<Timestamp> CREATOR = new Timestamp$Companion$CREATOR$1();

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0007J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0018\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0\u000e*\u00020\u000fH\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m18302d2 = {"Lcom/google/firebase/Timestamp$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/google/firebase/Timestamp;", "now", "validateRange", "", "seconds", "", "nanoseconds", "", "toPreciseTime", "Lkotlin/Pair;", "Ljava/util/Date;", "com.google.firebase-firebase-common"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final /* synthetic */ Pair access$toPreciseTime(Companion companion, Date date) {
            return companion.toPreciseTime(date);
        }

        public static final /* synthetic */ void access$validateRange(Companion companion, long j, int i) {
            companion.validateRange(j, i);
        }

        private final Pair<Long, Integer> toPreciseTime(Date date) {
            long j = 1000;
            long time = date.getTime() / j;
            int time2 = (int) ((date.getTime() % j) * ((long) 1000000));
            return time2 < 0 ? new Pair<>(Long.valueOf(time - 1), Integer.valueOf(time2 + 1000000000)) : new Pair<>(Long.valueOf(time), Integer.valueOf(time2));
        }

        private final void validateRange(long seconds, int nanoseconds) {
            if (nanoseconds < 0 || nanoseconds >= 1000000000) {
                throw new IllegalArgumentException(AbstractC0000a.m9f(nanoseconds, "Timestamp nanoseconds out of range: ").toString());
            }
            if (-62135596800L > seconds || seconds >= 253402300800L) {
                throw new IllegalArgumentException(AbstractC0455a.m2238m(seconds, "Timestamp seconds out of range: ").toString());
            }
        }

        @JvmStatic
        @NotNull
        public final Timestamp now() {
            return new Timestamp(new Date());
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.Timestamp$compareTo$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
    public /* synthetic */ class C45961 extends PropertyReference1Impl {
        public static final C45961 INSTANCE = new C45961();

        public C45961() {
            super(Timestamp.class, "seconds", "getSeconds()J", 0);
        }

        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
        @Nullable
        public Object get(@Nullable Object obj) {
            return Long.valueOf(((Timestamp) obj).getSeconds());
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.Timestamp$compareTo$2 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
    public /* synthetic */ class C45972 extends PropertyReference1Impl {
        public static final C45972 INSTANCE = new C45972();

        public C45972() {
            super(Timestamp.class, "nanoseconds", "getNanoseconds()I", 0);
        }

        @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
        @Nullable
        public Object get(@Nullable Object obj) {
            return Integer.valueOf(((Timestamp) obj).getNanoseconds());
        }
    }

    public Timestamp(long j, int i) {
        Companion.access$validateRange(INSTANCE, j, i);
        this.seconds = j;
        this.nanoseconds = i;
    }

    @JvmStatic
    @NotNull
    public static final Timestamp now() {
        return INSTANCE.now();
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Timestamp timestamp) {
        return compareTo2(timestamp);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (other != this) {
            return (other instanceof Timestamp) && compareTo2((Timestamp) other) == 0;
        }
        return true;
    }

    public final int getNanoseconds() {
        return this.nanoseconds;
    }

    public final long getSeconds() {
        return this.seconds;
    }

    public int hashCode() {
        long j = this.seconds;
        return (((((int) j) * 1369) + ((int) (j >> 32))) * 37) + this.nanoseconds;
    }

    @NotNull
    public final Date toDate() {
        return new Date((this.seconds * ((long) 1000)) + ((long) (this.nanoseconds / 1000000)));
    }

    @RequiresApi
    @NotNull
    public final Instant toInstant() {
        Instant instantM15019o = AbstractC4465b.m15019o(this.seconds, this.nanoseconds);
        Intrinsics.m18598f(instantM15019o, "ofEpochSecond(seconds, nanoseconds.toLong())");
        return instantM15019o;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("Timestamp(seconds=");
        sb.append(this.seconds);
        sb.append(", nanoseconds=");
        return AbstractC0000a.m17n(sb, this.nanoseconds, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.m18599g(dest, "dest");
        dest.writeLong(this.seconds);
        dest.writeInt(this.nanoseconds);
    }

    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(@NotNull Timestamp other) {
        Intrinsics.m18599g(other, "other");
        Function1[] function1Arr = {C45961.INSTANCE, C45972.INSTANCE};
        for (int i = 0; i < 2; i++) {
            Function1 function1 = function1Arr[i];
            int iM18545a = ComparisonsKt.m18545a((Comparable) function1.invoke(this), (Comparable) function1.invoke(other));
            if (iM18545a != 0) {
                return iM18545a;
            }
        }
        return 0;
    }

    public Timestamp(@NotNull Date date) {
        Intrinsics.m18599g(date, "date");
        Companion companion = INSTANCE;
        Pair pairAccess$toPreciseTime = Companion.access$toPreciseTime(companion, date);
        long jLongValue = ((Number) pairAccess$toPreciseTime.f51426a).longValue();
        int iIntValue = ((Number) pairAccess$toPreciseTime.f51427b).intValue();
        Companion.access$validateRange(companion, jLongValue, iIntValue);
        this.seconds = jLongValue;
        this.nanoseconds = iIntValue;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @RequiresApi
    public Timestamp(@NotNull Instant time) {
        this(AbstractC4465b.m15006b(time), AbstractC4465b.m15005a(time));
        Intrinsics.m18599g(time, "time");
    }
}
