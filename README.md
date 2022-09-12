# CleanArchitectureNoteApp

NotesApp created using jetpack compose with clean architecture.  This is a simple offline CRUD application which uses the following:

  1. MVVM
  2. Kotlin Coroutines
  3. Dagger Hilt
  4. Room DB
  5. Flows
  6. Clean architecture Use Cases 
  
  USE CASES:
  
  This is where the business logic goes as opposed to the contemporary MVVM pattern where business logic is contained in View Model.
  An advantage of this approach is that business logic can easily be used by different View Models.  Complex View Models do not have to take large 
  number of Repositories in the constructor as this is handled by the use cases. Use Cases for a given feature could be combined into a single data class 
  and the class injected to the View Model.  
  
  In clean aarchitecture, the View Model executes use cases and provides results as observables to the UI.  
  
  
