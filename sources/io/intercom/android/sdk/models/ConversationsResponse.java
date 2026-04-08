package io.intercom.android.sdk.models;

import androidx.annotation.Nullable;
import io.intercom.android.sdk.models.BaseResponse;
import io.intercom.android.sdk.models.ConversationList;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class ConversationsResponse extends BaseResponse {
    private final ConversationList conversationPage;

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder extends BaseResponse.Builder {

        @Nullable
        ConversationList.Builder conversation_page;

        @Override // io.intercom.android.sdk.models.BaseResponse.Builder
        public /* bridge */ /* synthetic */ BaseResponse build() {
            return build();
        }

        public Builder withConversationPage(ConversationList.Builder builder) {
            this.conversation_page = builder;
            return this;
        }

        @Override // io.intercom.android.sdk.models.BaseResponse.Builder
        public ConversationsResponse build() {
            return new ConversationsResponse(this);
        }
    }

    public ConversationsResponse(Builder builder) {
        super(builder);
        ConversationList.Builder builder2 = builder.conversation_page;
        this.conversationPage = builder2 == null ? new ConversationList.Builder().build() : builder2.build();
    }

    public ConversationList getConversationPage() {
        return this.conversationPage;
    }
}
