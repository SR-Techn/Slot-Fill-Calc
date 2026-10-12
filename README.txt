SLOT FILL CALC Android project

This is an Android WebView wrapper project containing the offline calculator and gauge table. The source workbook's formula is reproduced for total area: (wire1 area x conductors + wire2 area x conductors) x turns. Resistance correction to 30°C is also included.

IMPORTANT: This is an initial prototype and must be validated against Excel before engineering/production use. The correction-factor input is shown because it exists in the workbook but the original total-area formula does not use it. The workbook has a “Dual Coated (DC)” selector that maps to the medium-overall-diameter column in its lookup table.

Build APK without installing Android Studio locally:
1. Sign in to GitHub and create a new private repository.
2. Upload the contents of this folder (not the outer folder) to the repository.
3. Open Actions, choose “Build Slot Fill Calc APK”, then Run workflow.
4. When completed, open the workflow run and download artifact “Slot-Fill-Calc-debug-apk”. Extract it to obtain app-debug.apk.
5. Transfer APK to Android phone and install. Android may ask permission to install apps from that source.

This environment does not have Android SDK/Gradle build tooling, so I cannot honestly label a file as a compiled APK here. The GitHub Actions workflow builds it in the cloud.
