package com.example.chatapp.listeners;

import com.example.chatapp.models.User;

public interface CallListener {

    void initiateVideoMeeting(User user);

    void initiateAudioMeeting(User user);
}
