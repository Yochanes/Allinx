package com.exchange.allin.net.api.service;

import com.exchange.allin.data.GuessData;
import com.exchange.allin.net.response.ApiResponse;
import com.google.gson.JsonObject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\bf\u0018\u00002\u00020\u0001:\u0001 J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J4\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\u0006H§@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\u0006H§@¢\u0006\u0004\b\u0010\u0010\u0011J*\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\u0006H§@¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0015\u001a\u00020\u0014H§@¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0018\u0010\u0005J@\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u00062\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\f2\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\u0006H§@¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\u001c\u0010\u000fJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u001d\u0010\u0005J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u001e\u0010\u0005J \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0015\u001a\u00020\u0014H§@¢\u0006\u0004\b\u001f\u0010\u0017¨\u0006!"}, m18302d2 = {"Lcom/exchange/allin/net/api/service/GuessService;", "", "Lcom/exchange/allin/net/response/ApiResponse;", "Lcom/exchange/allin/data/GuessData;", "i", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "status", "pageNum", "pageSize", "f", "(IIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "topicId", "l", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "e", "(JIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "k", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/google/gson/JsonObject;", "body", "g", "(Lcom/google/gson/JsonObject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "d", "categoryId", "c", "(ILjava/lang/Long;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "j", "b", "h", "Companion", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public interface GuessService {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/net/api/service/GuessService$Companion;", "", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class Companion {
    }

    @GET("clairvoy/topics/{topicId}")
    @Nullable
    /* JADX INFO: renamed from: a */
    Object m13307a(@Path("topicId") long j, @NotNull Continuation<? super ApiResponse<GuessData>> continuation);

    @GET("clairvoy/categories")
    @Nullable
    /* JADX INFO: renamed from: b */
    Object m13308b(@NotNull Continuation<? super ApiResponse<GuessData>> continuation);

    @GET("clairvoy/topics")
    @Nullable
    /* JADX INFO: renamed from: c */
    Object m13309c(@Query("status") int i, @Nullable @Query("category_id") Long l, @Query("page_num") int i2, @Query("page_size") int i3, @NotNull Continuation<? super ApiResponse<GuessData>> continuation);

    @GET("clairvoy/topics/hot")
    @Nullable
    /* JADX INFO: renamed from: d */
    Object m13310d(@NotNull Continuation<? super ApiResponse<GuessData>> continuation);

    @GET("clairvoy/account/topics/{topicId}/votes")
    @Nullable
    /* JADX INFO: renamed from: e */
    Object m13311e(@Path("topicId") long j, @Query("page_num") int i, @Query("page_size") int i2, @NotNull Continuation<? super ApiResponse<GuessData>> continuation);

    @GET("clairvoy/account/topics")
    @Nullable
    /* JADX INFO: renamed from: f */
    Object m13312f(@Query("status") int i, @Query("page_num") int i2, @Query("page_size") int i3, @NotNull Continuation<? super ApiResponse<GuessData>> continuation);

    @POST("clairvoy/account/topics/vote")
    @Nullable
    /* JADX INFO: renamed from: g */
    Object m13313g(@Body @NotNull JsonObject jsonObject, @NotNull Continuation<? super ApiResponse<GuessData>> continuation);

    @POST("translation/translate")
    @Nullable
    /* JADX INFO: renamed from: h */
    Object m13314h(@Body @NotNull JsonObject jsonObject, @NotNull Continuation<? super ApiResponse<GuessData>> continuation);

    @GET("clairvoy/account/balance")
    @Nullable
    /* JADX INFO: renamed from: i */
    Object m13315i(@NotNull Continuation<? super ApiResponse<GuessData>> continuation);

    @GET("clairvoy/recently-votes")
    @Nullable
    /* JADX INFO: renamed from: j */
    Object m13316j(@NotNull Continuation<? super ApiResponse<GuessData>> continuation);

    @GET("clairvoy/account/transactions")
    @Nullable
    /* JADX INFO: renamed from: k */
    Object m13317k(@Query("page_num") int i, @Query("page_size") int i2, @NotNull Continuation<? super ApiResponse<GuessData>> continuation);

    @GET("clairvoy/account/topics/{topicId}/transactions")
    @Nullable
    /* JADX INFO: renamed from: l */
    Object m13318l(@Path("topicId") long j, @NotNull Continuation<? super ApiResponse<GuessData>> continuation);
}
