package com.emmanuel_yegon.chatapp.listeners;

import com.emmanuel_yegon.chatapp.models.User;

public interface ConversationListener {
    void onConversationClicked(User user);
}
