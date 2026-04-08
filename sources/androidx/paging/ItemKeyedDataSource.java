package androidx.paging;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0004\u0005\u0006\u0007\b¨\u0006\t"}, m18302d2 = {"Landroidx/paging/ItemKeyedDataSource;", "", "Key", "Value", "Landroidx/paging/DataSource;", "LoadCallback", "LoadInitialCallback", "LoadInitialParams", "LoadParams", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@Deprecated
@SourceDebugExtension
public abstract class ItemKeyedDataSource<Key, Value> extends DataSource<Key, Value> {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b&\u0018\u0000*\u0004\b\u0002\u0010\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/paging/ItemKeyedDataSource$LoadCallback;", "Value", "", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static abstract class LoadCallback<Value> {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/paging/ItemKeyedDataSource$LoadInitialCallback;", "Value", "Landroidx/paging/ItemKeyedDataSource$LoadCallback;", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static abstract class LoadInitialCallback<Value> extends LoadCallback<Value> {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0016\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Landroidx/paging/ItemKeyedDataSource$LoadInitialParams;", "", "Key", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static class LoadInitialParams<Key> {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0016\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Landroidx/paging/ItemKeyedDataSource$LoadParams;", "", "Key", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static class LoadParams<Key> {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[LoadType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }
}
