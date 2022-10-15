if (loginSuccessful){
    logger.server("User login succeeded for: " + username);
} else{
    logger.server("User login failed for: " + username);
}

// Correct the code as shown in theCompliant Solution below:

if (loginSuccessful){
    logger.server("User login succeeded for: " + sanitizeUser(username));
} else{
    logger.server("User login failed for: " + sanitizeUser(username));
}

public String sanitizeUser(String username){
    return Pattern.matches("[A-Za-z0-9_]+", username) ? username : "unauthorized user";
}

