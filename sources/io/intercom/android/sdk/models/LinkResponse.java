package io.intercom.android.sdk.models;

import io.intercom.android.sdk.models.BaseResponse;
import io.intercom.android.sdk.models.Link;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class LinkResponse extends BaseResponse {
    private final Link link;

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder extends BaseResponse.Builder {
        Link.Builder article;

        @Override // io.intercom.android.sdk.models.BaseResponse.Builder
        public /* bridge */ /* synthetic */ BaseResponse build() {
            return build();
        }

        @Override // io.intercom.android.sdk.models.BaseResponse.Builder
        public LinkResponse build() {
            return new LinkResponse(this);
        }
    }

    public LinkResponse(Builder builder) {
        super(builder);
        Link.Builder builder2 = builder.article;
        this.link = builder2 == null ? new Link.Builder().build() : builder2.build();
    }

    public Link getLink() {
        return this.link;
    }
}
