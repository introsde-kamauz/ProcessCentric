# ProcessCentric
The service that orchestrate all the operation within the process

## Functions
REST
- (GET) **/users**  =>  permits to the people to know the name of the users
- (GET) **/{id}/recommArtists**  =>  recommends artists to the user with a specific ID field
- (GET) **/{id}/recommEvents/{origin}**  =>  recommends events to the user based on artist preferences. The current place (origin) is requested in order to track the distance and the time between the user and the location
- (GET) **/getMotivation**  =>  get a random generated motivational quote
- (GET) **/{id}/getUserArtists**  =>  get the artists corresponding to the specific user preferences
- (GET) **/{id}/getEvaluations**  =>  get the evalution of a specific user to rate the recommendations of the artists

- (POST) **/register**  =>  register an user with the given name
- (POST) **/evaluateArtistRecommendation**  =>  permits to evaluate a recommendation
- (POST) **/addArtist**  =>  permits to add a new user preference

- (DELETE) **/{id}/remArtist/{name}**  =>  remove an user preference based on the name of the artist 
