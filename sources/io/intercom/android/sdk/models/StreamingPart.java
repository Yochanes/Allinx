package io.intercom.android.sdk.models;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred
@kotlin.Metadata(m18301d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\r\u001a\u00020\u000eH×\u0001J\t\u0010\u000f\u001a\u00020\u0010H×\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m18302d2 = {"Lio/intercom/android/sdk/models/StreamingPart;", "", "metadata", "Lio/intercom/android/sdk/models/Metadata;", "<init>", "(Lio/intercom/android/sdk/models/Metadata;)V", "getMetadata", "()Lio/intercom/android/sdk/models/Metadata;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final /* data */ class StreamingPart {
    public static final int $stable = 8;

    @SerializedName("metadata")
    @Nullable
    private final Metadata metadata;

    public StreamingPart() {
        this(null, 1, null);
    }

    public static /* synthetic */ StreamingPart copy$default(StreamingPart streamingPart, Metadata metadata, int i, Object obj) {
        if ((i & 1) != 0) {
            metadata = streamingPart.metadata;
        }
        return streamingPart.copy(metadata);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Metadata getMetadata() {
        return this.metadata;
    }

    @NotNull
    public final StreamingPart copy(@Nullable Metadata metadata) {
        return new StreamingPart(metadata);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof StreamingPart) && Intrinsics.m18594b(this.metadata, ((StreamingPart) other).metadata);
    }

    @Nullable
    public final Metadata getMetadata() {
        return this.metadata;
    }

    public int hashCode() {
        Metadata metadata = this.metadata;
        if (metadata == null) {
            return 0;
        }
        return metadata.hashCode();
    }

    @NotNull
    public String toString() {
        return "StreamingPart(metadata=" + this.metadata + ')';
    }

    public StreamingPart(@Nullable Metadata metadata) {
        this.metadata = metadata;
    }

    public /* synthetic */ StreamingPart(Metadata metadata, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : metadata);
    }
}
