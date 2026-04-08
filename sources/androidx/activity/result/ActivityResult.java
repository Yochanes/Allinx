package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/activity/result/ActivityResult;", "Landroid/os/Parcelable;", "Companion", "activity_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@SuppressLint({"BanParcelableUsage"})
public final class ActivityResult implements Parcelable {

    @JvmField
    @NotNull
    public static final Parcelable.Creator<ActivityResult> CREATOR = new ActivityResult$Companion$CREATOR$1();

    /* JADX INFO: renamed from: a */
    public final int f210a;

    /* JADX INFO: renamed from: b */
    public final Intent f211b;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/activity/result/ActivityResult$Companion;", "", "activity_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public ActivityResult(int i, Intent intent) {
        this.f210a = i;
        this.f211b = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i = this.f210a;
        sb.append(i != -1 ? i != 0 ? String.valueOf(i) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.f211b);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.m18599g(dest, "dest");
        dest.writeInt(this.f210a);
        Intent intent = this.f211b;
        dest.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(dest, i);
        }
    }
}
