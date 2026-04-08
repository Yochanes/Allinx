package io.intercom.android.sdk.models;

import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_ConversationList extends ConversationList {
    private final List<Conversation> getConversations;
    private final EmptyState getEmptyState;
    private final Set<String> getUnreadConversationIds;
    private final int getUnreadConversationsCount;
    private final boolean hasMorePages;

    public AutoValue_ConversationList(List<Conversation> list, Set<String> set, int i, EmptyState emptyState, boolean z2) {
        if (list == null) {
            throw new NullPointerException("Null getConversations");
        }
        this.getConversations = list;
        if (set == null) {
            throw new NullPointerException("Null getUnreadConversationIds");
        }
        this.getUnreadConversationIds = set;
        this.getUnreadConversationsCount = i;
        if (emptyState == null) {
            throw new NullPointerException("Null getEmptyState");
        }
        this.getEmptyState = emptyState;
        this.hasMorePages = z2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ConversationList) {
            ConversationList conversationList = (ConversationList) obj;
            if (this.getConversations.equals(conversationList.getConversations()) && this.getUnreadConversationIds.equals(conversationList.getUnreadConversationIds()) && this.getUnreadConversationsCount == conversationList.getUnreadConversationsCount() && this.getEmptyState.equals(conversationList.getEmptyState()) && this.hasMorePages == conversationList.hasMorePages()) {
                return true;
            }
        }
        return false;
    }

    @Override // io.intercom.android.sdk.models.ConversationList
    public List<Conversation> getConversations() {
        return this.getConversations;
    }

    @Override // io.intercom.android.sdk.models.ConversationList
    public EmptyState getEmptyState() {
        return this.getEmptyState;
    }

    @Override // io.intercom.android.sdk.models.ConversationList
    public Set<String> getUnreadConversationIds() {
        return this.getUnreadConversationIds;
    }

    @Override // io.intercom.android.sdk.models.ConversationList
    public int getUnreadConversationsCount() {
        return this.getUnreadConversationsCount;
    }

    @Override // io.intercom.android.sdk.models.ConversationList
    public boolean hasMorePages() {
        return this.hasMorePages;
    }

    public int hashCode() {
        return ((((((((this.getConversations.hashCode() ^ 1000003) * 1000003) ^ this.getUnreadConversationIds.hashCode()) * 1000003) ^ this.getUnreadConversationsCount) * 1000003) ^ this.getEmptyState.hashCode()) * 1000003) ^ (this.hasMorePages ? 1231 : 1237);
    }

    public String toString() {
        return "ConversationList{getConversations=" + this.getConversations + ", getUnreadConversationIds=" + this.getUnreadConversationIds + ", getUnreadConversationsCount=" + this.getUnreadConversationsCount + ", getEmptyState=" + this.getEmptyState + ", hasMorePages=" + this.hasMorePages + "}";
    }
}
