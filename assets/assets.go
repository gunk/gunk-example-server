package assets

import (
	_ "embed"
)

//go:embed countries.csv
var Countries []byte
