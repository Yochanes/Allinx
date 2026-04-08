package retrofit2;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public interface Callback<T> {
    void onFailure(Call call, Throwable th);

    void onResponse(Call call, Response response);
}
