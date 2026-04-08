package io.intercom.android.sdk.api;

import com.google.android.gms.common.internal.ImagesContract;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import okhttp3.MultipartBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Url;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b`\u0018\u00002\u00020\u0001Jz\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\b2\b\b\u0001\u0010\f\u001a\u00020\b2\b\b\u0001\u0010\r\u001a\u00020\b2\b\b\u0001\u0010\u000e\u001a\u00020\b2\b\b\u0001\u0010\u000f\u001a\u00020\b2\b\b\u0001\u0010\u0010\u001a\u00020\bH§@¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, m18302d2 = {"Lio/intercom/android/sdk/api/ExternalUploadApi;", "", "uploadFileSuspended", "Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse;", "", ImagesContract.URL, "", "key", "Lokhttp3/MultipartBody$Part;", "acl", "contentType", "accessKey", "policy", "signature", "successActionStatus", "metadata", "filePart", "(Ljava/lang/String;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public interface ExternalUploadApi {
    @POST
    @Nullable
    @Multipart
    Object uploadFileSuspended(@Url @Nullable String str, @NotNull @Part MultipartBody.Part part, @NotNull @Part MultipartBody.Part part2, @NotNull @Part MultipartBody.Part part3, @NotNull @Part MultipartBody.Part part4, @NotNull @Part MultipartBody.Part part5, @NotNull @Part MultipartBody.Part part6, @NotNull @Part MultipartBody.Part part7, @NotNull @Part MultipartBody.Part part8, @NotNull @Part MultipartBody.Part part9, @NotNull Continuation<? super NetworkResponse<Unit>> continuation);
}
