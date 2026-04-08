package androidx.paging;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003:\u0005\u0005\u0006\u0007\b\t¨\u0006\n"}, m18302d2 = {"Landroidx/paging/PositionalDataSource;", "", "T", "Landroidx/paging/DataSource;", "", "Companion", "LoadInitialCallback", "LoadInitialParams", "LoadRangeCallback", "LoadRangeParams", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@Deprecated
@SourceDebugExtension
public abstract class PositionalDataSource<T> extends DataSource<Integer, T> {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/paging/PositionalDataSource$Companion;", "", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b&\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/paging/PositionalDataSource$LoadInitialCallback;", "T", "", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static abstract class LoadInitialCallback<T> {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/paging/PositionalDataSource$LoadInitialParams;", "", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static class LoadInitialParams {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b&\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/paging/PositionalDataSource$LoadRangeCallback;", "T", "", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static abstract class LoadRangeCallback<T> {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/paging/PositionalDataSource$LoadRangeParams;", "", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static class LoadRangeParams {
    }
}
