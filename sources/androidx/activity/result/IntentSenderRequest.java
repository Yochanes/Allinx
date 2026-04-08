package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/activity/result/IntentSenderRequest;", "Landroid/os/Parcelable;", "Builder", "Companion", "activity_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@SuppressLint({"BanParcelableUsage"})
public final class IntentSenderRequest implements Parcelable {

    @JvmField
    @NotNull
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new IntentSenderRequest$Companion$CREATOR$1();

    /* JADX INFO: renamed from: a */
    public final IntentSender f230a;

    /* JADX INFO: renamed from: b */
    public final Intent f231b;

    /* JADX INFO: renamed from: c */
    public final int f232c;

    /* JADX INFO: renamed from: d */
    public final int f233d;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/activity/result/IntentSenderRequest$Builder;", "", "Flag", "activity_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Builder {

        /* JADX INFO: renamed from: a */
        public Intent f234a;

        /* JADX INFO: renamed from: b */
        public int f235b;

        /* JADX INFO: renamed from: c */
        public int f236c;

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0083\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, m18302d2 = {"Landroidx/activity/result/IntentSenderRequest$Builder$Flag;", "", "activity_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
        @Retention(RetentionPolicy.SOURCE)
        @kotlin.annotation.Retention
        public @interface Flag {
        }

        public Builder(IntentSender intentSender) {
            Intrinsics.m18599g(intentSender, "intentSender");
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/activity/result/IntentSenderRequest$Companion;", "", "activity_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public IntentSenderRequest(IntentSender intentSender, Intent intent, int i, int i2) {
        Intrinsics.m18599g(intentSender, "intentSender");
        this.f230a = intentSender;
        this.f231b = intent;
        this.f232c = i;
        this.f233d = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.m18599g(dest, "dest");
        dest.writeParcelable(this.f230a, i);
        dest.writeParcelable(this.f231b, i);
        dest.writeInt(this.f232c);
        dest.writeInt(this.f233d);
    }
}
