package io.intercom.android.sdk.models;

import androidx.annotation.Nullable;
import io.intercom.android.sdk.models.BaseResponse;
import io.intercom.android.sdk.models.ConversationList;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class UsersResponse extends BaseResponse {
    private final ConversationList unreadConversations;
    private final UnreadTickets unreadTickets;

    /* JADX INFO: compiled from: Proguard */
    public static class Builder extends BaseResponse.Builder {

        @Nullable
        ConversationList.Builder unread_conversations;

        @Nullable
        UnreadTickets unread_tickets;

        @Override // io.intercom.android.sdk.models.BaseResponse.Builder
        public /* bridge */ /* synthetic */ BaseResponse build() {
            return build();
        }

        @Override // io.intercom.android.sdk.models.BaseResponse.Builder
        public UsersResponse build() {
            return new UsersResponse(this);
        }
    }

    public UsersResponse(Builder builder) {
        super(builder);
        ConversationList.Builder builder2 = builder.unread_conversations;
        this.unreadConversations = builder2 == null ? new ConversationList.Builder().build() : builder2.build();
        UnreadTickets unreadTickets = builder.unread_tickets;
        this.unreadTickets = unreadTickets == null ? UnreadTickets.INSTANCE.getNULL() : unreadTickets;
    }

    public ConversationList getUnreadConversations() {
        return this.unreadConversations;
    }

    public UnreadTickets getUnreadTickets() {
        return this.unreadTickets;
    }
}
