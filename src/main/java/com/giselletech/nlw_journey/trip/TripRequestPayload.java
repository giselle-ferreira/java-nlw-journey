package com.giselletech.nlw_journey.trip;

import java.util.List;


public record TripRequestPayload(
        String destination,
        String startsAt,
        String endsAt,
        List<String> emailsToInvite,
        String ownerEmail,
        String ownerName) {
}
