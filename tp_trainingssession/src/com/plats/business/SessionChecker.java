package com.plats.business;

import java.util.Collection;

public class SessionChecker {
	
	private static Collection<Focus> sessionFocusEqualsExerciseFocus(Trainingssession session){
		Collection<Focus> sessionFocuses = session.getFocuses();
		
		for(Exercise exercise : session.getExercises()){
			for(Focus exerciseFocus : exercise.getFocuses()){
				if(sessionFocuses.contains(exerciseFocus)){
					sessionFocuses.remove(exerciseFocus);
				}
			}
				
		}
		
		return sessionFocuses;
	}
	
	public static boolean isSessionValid(Trainingssession session){
		boolean isValid = true;
		
		Collection<Focus> focusErrors = sessionFocusEqualsExerciseFocus(session);
		if(!focusErrors.isEmpty()){
			isValid = false;
		}
		
		return isValid;
	}
}