# Countries GraphQL API Demo

This project demonstrates how to use Apollo Client to fetch data from the Countries GraphQL API and display it in a `RecyclerView` in an Android application.

## Features

- Fetches a list of countries from the Countries GraphQL API.
- Displays country details in a `RecyclerView`.

## Project Structure

- `data`: Contains data sources and repository classes.
    - `sources/remote/services`: Contains the Apollo Client and API service classes.
    - `repository`: Contains the repository class for fetching data.
- `presentation/ui/main`: Contains the main activity and UI components.



## Setup
1. Clone the repository.
2. Open the project in Android Studio.
3. Run the project on an emulator or physical device.
4. View the list of countries in the app.

## Dependencies
- Apollo Android: A strongly-typed, caching GraphQL client for Android, written in Java.
- Coroutines: A library for managing asynchronous programming in Kotlin.
- RecyclerView: A UI component for displaying large sets of data in a scrollable list.

## Documentation
- [Countries GraphQL API](https://countries.trevorblades.com/): A public GraphQL API for information about countries.
- [Apollo Android](https://www.apollographql.com/docs/android/): A strongly-typed, caching GraphQL client for Android, written in Java.
- [Coroutines](https://kotlinlang.org/docs/coroutines-overview.html): A library for managing asynchronous programming in Kotlin.
- [RecyclerView](https://developer.android.com/guide/topics/ui/layout/recyclerview): A UI component for displaying large sets of data in a scrollable list.
- Download the GraphQL schema from the Countries GraphQL API [here](https://countries.trevorblades.com/).
```
./gradlew downloadServiceApolloSchema --endpoint="https://countries.trevorblades.com/graphql" --schema="app/src/main/graphql/schema.graphqls"
```