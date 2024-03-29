class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.${format})?"{
            constraints {
                // apply constraints here
            }
        }

        "/user"(controller: "users", parseRequest: true)
        {
              action = [GET: "getAllUsers"]
        }
        
        "/dashboardGetAssignTask"(controller: "dashboard", parseRequest: true)
        {
              action = [GET: "getAllAssignedTask"]
        }
        "/getPageCount"(controller: "dashboard", parseRequest: true)
        {
              action = [GET: "getPageCount"]
        }
        
        "/dashboardGetCreatedProject"(controller: "dashboard", parseRequest: true)
        {
              action = [GET: "getAllCreatedProject"]
        }
        
        "/GetProjectList"(controller: "dashboard", parseRequest: true)
        {
              action = [GET: "getAllCreatedProject"]
        }
        "/dashboardUpdateAssignedTask"(controller: "dashboard", parseRequest: true)
        {
             action = [PUT : "updateAssignedTask"]
            
        }
        
        "/dashboardGetTaskStatus"(controller: "dashboard", parseRequest: true)
        {
             action = [GET : "getTaskStatus"]
            
        }
        
       "/project"(controller: "project", parseRequest: true)
        {
              action = [POST: "add" , PUT : "update" , GET: "get"]
        }
        
        "/AllUserStoryForSpecificProject"(controller: "userStory", parseRequest: true)
        {
              action = [GET: "getUserStoryForSpecificProject"]
        }
        
        "/updateUserStory"(controller: "userStory", parseRequest: true)
        {
              action = [PUT: "updateUserStory"]
        }
        "/fetchUserStorysForProject"(controller: "userStory", parseRequest: true)
        {
              action = [GET: "getfetchUserStorysForProject"]
        }
        "/release"(controller: "release", parseRequest: true)
        {
            action = [POST: "add" , PUT : "update", GET: "get"]      
        }
        
        "/ReleasesForSpecificProject"(controller: "release", parseRequest: true)
        {
            action = [GET: "getReleasesForSpecificProject"]      
        }
        
         "/getPageCountForRelease"(controller: "release", parseRequest: true)
        {
              action = [GET: "getPageCountForRelease"]
        }
        
        
        
        
         "/getPageCountForUserStory"(controller: "userStory", parseRequest: true)
        {
              action = [GET: "getPageCountForUserStory"]
        }
        
        
        
        "/sprint"(controller: "sprint", parseRequest: true)
        {
             action = [POST: "add" , PUT : "update" , GET: "get"]
           
        }
        
        "/SprintsForSpecificRelease"(controller: "sprint", parseRequest: true)
        {
             action = [GET: "getSprintsForSpecificRelease"]
           
        }
        
        
         "/getPageCountForSprints"(controller: "sprint", parseRequest: true)
        {
             action = [GET: "getPageCountForSprints"]
           
        }
        "/task"(controller: "task", parseRequest: true)
        {
             action = [POST: "add" , PUT : "update" , GET: "get"]
            
        }
        "/fetchUsersForTask"(controller: "task", parseRequest: true)
        {
             action = [GET: "getAllUsers"]
            
        }
        
        
        
        
        "/getPageCountForTasks"(controller: "task", parseRequest: true)
        {
             action = [GET: "getPageCountForTasks"]
            
        }
        
        "/UserStoryForSpecificRelease"(controller: "userStory", parseRequest: true)
        {
            action = [POST: "add" , PUT : "update" , GET: "getUserStoryForSpecificRelease"]
            
        }
        "/UserStoryForSpecificSprint"(controller: "userStory", parseRequest: true)
        {
            action = [GET: "getUserStoryForSpecificSprint"]
            
        }
        
        "/UserStoryForSpecificProject"(controller: "userStory", parseRequest: true)
        {
            action = [POST: "saveUserStoryForSpecificProject"]
            
        }
        
         "/updateProfile"(controller:"users",parseRequest: true)
        {
             action = [POST: "updateProfile"]
        }
        
        "/checkMailSignUp"(controller: "users", parseRequest: true)
        {
            action = [POST: "checkMailSignUp" , GET: "checkMailSignUp"]
            
        }
        
        "/fetchUserStoriesForSpecificSprint"(controller: "userStory", parseRequest: true)
        {
            action = [GET: "fetchUserStoriesForSpecificSprint"]
            
        }
        "/saveTaskFromReleaseBoard"(controller: "task", parseRequest: true)
        {
            action = [POST: "addTaskFromReleaseBoard"]
            
        }
        
         "/fetchDatesForParticularSprint"(controller: "sprint", parseRequest: true)
        {
            action = [GET: "fetchDatesForParticularSprint"]            
        }

        "/"(view:"/users/LoginPage")
        "500"(view:'/error')
	}   
}