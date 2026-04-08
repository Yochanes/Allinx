package io.intercom.android.sdk.p032m5.components.avatar;

import com.google.gson.annotations.SerializedName;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, m18302d2 = {"Lio/intercom/android/sdk/m5/components/avatar/AvatarShape;", "", "<init>", "(Ljava/lang/String;I)V", "CIRCLE", "SQUIRCLE", "Companion", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class AvatarShape {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AvatarShape[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @SerializedName("circle")
    public static final AvatarShape CIRCLE = new AvatarShape("CIRCLE", 0);

    @SerializedName("squircle")
    public static final AvatarShape SQUIRCLE = new AvatarShape("SQUIRCLE", 1);

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m18302d2 = {"Lio/intercom/android/sdk/m5/components/avatar/AvatarShape$Companion;", "", "<init>", "()V", "fromName", "Lio/intercom/android/sdk/m5/components/avatar/AvatarShape;", "shape", "", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AvatarShape fromName(@NotNull String shape) {
            AvatarShape next;
            Intrinsics.m18599g(shape, "shape");
            Iterator<AvatarShape> it = AvatarShape.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (StringsKt.m20442r(next.name(), shape, true)) {
                    break;
                }
            }
            AvatarShape avatarShape = next;
            return avatarShape == null ? AvatarShape.CIRCLE : avatarShape;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ AvatarShape[] $values() {
        return new AvatarShape[]{CIRCLE, SQUIRCLE};
    }

    static {
        AvatarShape[] avatarShapeArr$values = $values();
        $VALUES = avatarShapeArr$values;
        $ENTRIES = EnumEntriesKt.m18563a(avatarShapeArr$values);
        INSTANCE = new Companion(null);
    }

    private AvatarShape(String str, int i) {
    }

    @NotNull
    public static EnumEntries<AvatarShape> getEntries() {
        return $ENTRIES;
    }

    public static AvatarShape valueOf(String str) {
        return (AvatarShape) Enum.valueOf(AvatarShape.class, str);
    }

    public static AvatarShape[] values() {
        return (AvatarShape[]) $VALUES.clone();
    }
}
