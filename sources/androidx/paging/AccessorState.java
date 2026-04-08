package androidx.paging;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0002\u0004\u0005¨\u0006\u0006"}, m18302d2 = {"Landroidx/paging/AccessorState;", "", "Key", "Value", "BlockState", "PendingRequest", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
final class AccessorState<Key, Value> {

    /* JADX INFO: renamed from: a */
    public boolean f30524a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/paging/AccessorState$BlockState;", "", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class BlockState {

        /* JADX INFO: renamed from: a */
        public static final BlockState f30525a;

        /* JADX INFO: renamed from: b */
        public static final BlockState f30526b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ BlockState[] f30527c;

        static {
            BlockState blockState = new BlockState("UNBLOCKED", 0);
            f30525a = blockState;
            BlockState blockState2 = new BlockState("COMPLETED", 1);
            BlockState blockState3 = new BlockState("REQUIRES_REFRESH", 2);
            f30526b = blockState3;
            f30527c = new BlockState[]{blockState, blockState2, blockState3};
        }

        public static BlockState valueOf(String str) {
            return (BlockState) Enum.valueOf(BlockState.class, str);
        }

        public static BlockState[] values() {
            return (BlockState[]) f30527c.clone();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u0001*\b\b\u0003\u0010\u0003*\u00020\u00012\u00020\u0001¨\u0006\u0004"}, m18302d2 = {"Landroidx/paging/AccessorState$PendingRequest;", "", "Key", "Value", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class PendingRequest<Key, Value> {

        /* JADX INFO: renamed from: a */
        public final LoadType f30528a;

        /* JADX INFO: renamed from: b */
        public PagingState f30529b;

        public PendingRequest(LoadType loadType, PagingState pagingState) {
            Intrinsics.m18599g(loadType, "loadType");
            this.f30528a = loadType;
            this.f30529b = pagingState;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
    public /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f30530a;

        static {
            int[] iArr = new int[LoadType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f30530a = iArr;
            int[] iArr2 = new int[BlockState.values().length];
            try {
                iArr2[1] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[2] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[0] = 3;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m11315a(LoadType loadType) {
        Intrinsics.m18599g(loadType, "loadType");
        CollectionsKt.m18428c0(null, new AccessorState$clearPendingRequest$1(loadType));
    }

    /* JADX INFO: renamed from: b */
    public final LoadState m11316b(LoadType loadType) {
        loadType.ordinal();
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public final void m11317c(LoadType loadType, BlockState blockState) {
        loadType.ordinal();
        throw null;
    }
}
