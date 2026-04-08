package com.exchange.allin.p021db.dao;

import androidx.room.Dao;
import com.exchange.allin.p021db.model.SearchAssetsCoinHistoryData;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Dao
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Lcom/exchange/allin/db/dao/SearchAssetsCoinHistoryDao;", "Lcom/exchange/allin/db/dao/BaseDAO;", "Lcom/exchange/allin/db/model/SearchAssetsCoinHistoryData;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public interface SearchAssetsCoinHistoryDao extends BaseDAO<SearchAssetsCoinHistoryData> {
    /* JADX INFO: renamed from: a */
    void mo13220a();

    /* JADX INFO: renamed from: b */
    void mo13221b(int i);

    /* JADX INFO: renamed from: c */
    ArrayList mo13222c();

    /* JADX INFO: renamed from: d */
    int mo13223d(String str);
}
